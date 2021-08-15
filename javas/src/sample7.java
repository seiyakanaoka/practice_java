// import java.awt.*;
// import java.awt.event.*;

// class sample1 extends Frame
// {
//   public static void main(String[] args)
//   {
//     sample1 sm = new sample1();
//   }
//   public sample1()
//   {
//     super("サンプル");

//     addWindowListener(new SampleWindowListener());

//     setSize(250, 200);
//     setVisible(true);
//   }

//   class SampleWindowListener extends WindowAdapter
//   {
//     public void windowClosing(WindowEvent e)
//     {
//       System.exit(0);
//     }
//   }
// }

// import java.awt.*;
// import java.awt.event.*;

// class sample1 extends Frame
// {
//   private Label lb;
//   public static void main(String[] args)
//   {
//     sample1 sm = new sample1();
//   }
//   public sample1()
//   {
//     super("サンプル");

//     lb = new Label("ようこそ");

//     add(lb);

//     lb.setForeground(Color.pink);
//     lb.setFont(new Font("Dialog", Font.BOLD, 24));

//     addWindowListener(new SampleWindowListener());

//     setSize(750, 600);
//     setVisible(true);
//   }

//   class SampleWindowListener extends WindowAdapter
//   {
//     public void windowClosing(WindowEvent e)
//     {
//       System.exit(0);
//     }
//   }
// }

import java.awt.*;
import java.awt.event.*;

class sample1 extends Frame
{
  private Button bt;
  public static void main(String[] args)
  {
    sample1 sm = new sample1();
  }
  public sample1()
  {
    super("サンプル");

    bt = new Button("ようこそ");

    add(bt);

    addWindowListener(new SampleWindowListener());
    bt.addActionListener(new SampleActionListener());

    setSize(750, 600);
    setVisible(true);
  }

  class SampleWindowListener extends WindowAdapter
  {
    public void windowClosing(WindowEvent e)
    {
      System.exit(0);
    }
  }
  class SampleActionListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      bt.setLabel("こんにちわ。");
    }
  }
}