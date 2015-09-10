package com.allmycode.icons;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ShowIconsWithFor {

  public static void main(String[] args) {

    int densityCode;
    String iconFileName = null, message = null;

    for (int i = 1; i <= 3; i++) {
      densityCode = i * 160;

      switch (densityCode) {
      case 160:
        iconFileName = "res/drawable-mdpi/cat.png";
        message = "mdpi";
        break;
      case 240:
        iconFileName = "res/drawable-hdpi/cat.png";
        message = "hdpi";
        break;
      case 320:
        iconFileName = "res/drawable-xhdpi/cat.png";
        message = "xhdpi";
        break;
      case 480:
        iconFileName = "res/drawable-xxhdpi/cat.png";
        message = "xxhdpi";
        break;
      default:
        iconFileName = "res/drawable/ic_dialog_alert.png";
        message = "No suitable icon";
        break;
      }

      ImageIcon icon = new ImageIcon(iconFileName);
      JOptionPane.showMessageDialog(null, message,
          "Icon", JOptionPane.INFORMATION_MESSAGE, icon);
    }
  }
}
