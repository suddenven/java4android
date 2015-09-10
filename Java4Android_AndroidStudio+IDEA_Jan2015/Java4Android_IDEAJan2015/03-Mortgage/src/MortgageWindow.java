import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

public class MortgageWindow {
  public static void main(String args[]) {
    Frame f = new MyFrame();
    f.setVisible(true);
  }
}

class MyFrame extends Frame implements TextListener {

  private static final long serialVersionUID = 1L;
  TextField principalField = new TextField("0.00", 15),
      rateField = new TextField("0.00", 6), yearsField = new TextField("0", 3);
  Label paymentField = new Label("                       ");
  double principal, rate, ratePercent;
  int years;
  final int paymentsPerYear = 12;
  final int timesPerYearCalculated = 12;
  double effectiveAnnualRate, interestRatePerPayment;
  double payment;

  public MyFrame() {
    setTitle("Mortgage Payment Calculator");
    setLayout(new GridLayout(4, 2));

    Label principalLabel = new Label("Principal $"), rateLabel = new Label(
        "Rate (%)"), yearsLabel = new Label("Years"), paymentLabel = new Label(
        "Payment $");
    Panel principalLabelPanel = new Panel(new FlowLayout(FlowLayout.RIGHT)), rateLabelPanel = new Panel(
        new FlowLayout(FlowLayout.RIGHT)), yearsLabelPanel = new Panel(
        new FlowLayout(FlowLayout.RIGHT)), paymentLabelPanel = new Panel(
        new FlowLayout(FlowLayout.RIGHT));
    Panel principalFieldPanel = new Panel(new FlowLayout(FlowLayout.LEFT)), rateFieldPanel = new Panel(
        new FlowLayout(FlowLayout.LEFT)), yearsFieldPanel = new Panel(
        new FlowLayout(FlowLayout.LEFT)), paymentFieldPanel = new Panel(
        new FlowLayout(FlowLayout.LEFT));

    principalLabelPanel.add(principalLabel);
    principalFieldPanel.add(principalField);
    rateLabelPanel.add(rateLabel);
    rateFieldPanel.add(rateField);
    yearsLabelPanel.add(yearsLabel);
    yearsFieldPanel.add(yearsField);
    paymentLabelPanel.add(paymentLabel);
    paymentFieldPanel.add(paymentField);
    add(principalLabelPanel);
    add(principalFieldPanel);
    add(rateLabelPanel);
    add(rateFieldPanel);
    add(yearsLabelPanel);
    add(yearsFieldPanel);
    add(paymentLabelPanel);
    add(paymentFieldPanel);

    principalField.addTextListener(this);
    rateField.addTextListener(this);
    yearsField.addTextListener(this);
    addWindowListener(new MyAdapter(this));

    setSize(350, 150);
    setVisible(true);
  }

  DecimalFormat currency = new DecimalFormat("##############0.00");

  public void textValueChanged(TextEvent e) {
    Object source = e.getSource();
    if (source == principalField || source == rateField || source == yearsField) {
      try {
        principal = Double.parseDouble(principalField.getText());
        ratePercent = Double.parseDouble(rateField.getText());
        rate = ratePercent / 100.0;
        years = Integer.parseInt(yearsField.getText());

        effectiveAnnualRate = Math.exp(timesPerYearCalculated
            * Math.log(1.0 + (rate / timesPerYearCalculated))) - 1.0;
        interestRatePerPayment = (Math.exp(Math.log(effectiveAnnualRate + 1.0)
            / (years * paymentsPerYear)) - 1.0)
            * years * paymentsPerYear;
        payment = principal
            * (interestRatePerPayment / paymentsPerYear)
            / (1.0 - Math.pow(
                ((interestRatePerPayment / paymentsPerYear) + 1.0), (-1.0
                    * years * paymentsPerYear)));

        if (Double.isNaN(payment)) {
          paymentField.setText("");
        } else {
          paymentField.setText(currency.format(payment));
        }
      } catch (NumberFormatException ex) {
        paymentField.setText("");
      }
    }
  }
}

class MyAdapter extends WindowAdapter {

  Frame myFrame;

  MyAdapter(Frame f) {
    super();
    myFrame = f;
  }

  public void windowClosing(WindowEvent e) {
    myFrame.dispose();
  }
}