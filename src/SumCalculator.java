import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SumCalculator extends Frame implements ActionListener {
    private final TextField num1Field;
    private final TextField num2Field;
    private final TextField resultField;
    public SumCalculator(){
        setTitle("Sum of two digits");
        setSize(400,400);
        setLayout(new GridLayout(4,2,2,2));
        setLocationRelativeTo(null);
        setVisible(true);

        add(new Label("a"));

        num1Field = new TextField();
        add(num1Field);

        add(new Label("b"));

        num2Field = new TextField();
        add(num2Field);

        add(new Label("sum"));
        resultField = new TextField();
        resultField.setEditable(false);
        add(resultField);
        Button calculateButton = new Button("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        Button clearButton = new Button("Clear");
        clearButton.addActionListener(this);
        add(clearButton);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if
        (e.getActionCommand().equals("Calculate")){
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 + num2;
                resultField.setText(Double.toString(result));
            }
            catch (NumberFormatException exception){
                resultField.setText("Ошибка! Введите число");
            }
        }
        else if
        (e.getActionCommand().equals("Clear")){
            num1Field.setText("");
            num2Field.setText("");
            resultField.setText("");
        }
    }
}
