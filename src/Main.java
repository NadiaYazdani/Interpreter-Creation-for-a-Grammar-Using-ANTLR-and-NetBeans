import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class Main extends JFrame {
    public Main() throws HeadlessException {
        super("مفسر");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font defaultFont = new Font("tahoma", Font.PLAIN, 20);
        this.setLayout(new BorderLayout(1, 1));
        setSize(800, 600);
        setLocationRelativeTo(null);
        JPanel opt = new JPanel();
        opt.setLayout(new GridLayout(1, 2, 1, 1));
        JTextArea input = new JTextArea("");
        input.setFont(defaultFont);
        JTextArea output = new JTextArea("");
        output.setEnabled(false);
        output.setDisabledTextColor(Color.BLACK);
        output.setFont(defaultFont);
        JButton run = new JButton("اجرا");
        run.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    org.antlr.v4.runtime.ANTLRInputStream inputstream = null;
                    inputstream = new org.antlr.v4.runtime.ANTLRInputStream(input.getText());
                    ProjectLexer projectLexer = new ProjectLexer(inputstream);
                    CommonTokenStream commonTokenStream = new CommonTokenStream(projectLexer);
                    ProjectParser projectParser = new ProjectParser(commonTokenStream);
                    ProjectParser.ProgramContext tree = projectParser.program();
                    MyVisitor myVisitor = new MyVisitor();
                    ProjectBaseVisitor<String> visitor = myVisitor;
                    tree.accept(visitor);
                    output.setText(myVisitor.getResult());
                } catch (Exception e1) {
                    output.setText(e1.getMessage());
                }
            }
        });
        run.setFont(defaultFont);
        opt.add(input);
        opt.add(output);
        add(run, BorderLayout.SOUTH);
        add(opt, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        Main temp = new Main();
    }
}
