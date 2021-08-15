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

// import java.awt.*;
// import java.awt.event.*;

// class sample1 extends Frame
// {
//   private Button bt;
//   public static void main(String[] args)
//   {
//     sample1 sm = new sample1();
//   }
//   public sample1()
//   {
//     super("サンプル");

//     bt = new Button("ようこそ");

//     add(bt);

//     addWindowListener(new SampleWindowListener());
//     bt.addMouseListener(new SampleMouseListener());

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
//   class SampleMouseListener implements MouseListener
//   {
//     public void mouseClicked(MouseEvent e){}
//     public void mouseReleased(MouseEvent e){}
//     public void mousePressed(MouseEvent e){}
//     public void mouseEntered(MouseEvent e)
//     {
//       bt.setLabel("いらっしゃいませ。");
//     }
//     public void mouseExited(MouseEvent e)
//     {
//       bt.setLabel("ようこそ。");
//     }
//   }
// }

// import java.awt.*;
// import java.awt.event.*;

// class sample1 extends Frame
// {
//   Image im;

//   public static void main(String[] args)
//   {
//     sample1 sm = new sample1();
//   }
//   public sample1()
//   {
//     super("サンプル");

//     Toolkit tk = getToolkit();
//     im = tk.getImage("Image.jpg");

//     addWindowListener(new SampleWindowListener());

//     setSize(750, 600);
//     setVisible(true);
//   }
//   public void paint(Graphics g)
//   {
//     g.drawImage(im, 100, 100, this);
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
//   int x = 10;
//   int y = 10;

//   public static void main(String[] args)
//   {
//     sample1 sm = new sample1();
//   }
//   public sample1()
//   {
//     super("サンプル");

//     addWindowListener(new SampleWindowListener());
//     addMouseListener(new SampleMouseAdapter());

//     setSize(750, 600);
//     setVisible(true);
//   }
//   public void paint(Graphics g)
//   {
//     g.setColor(Color.RED);
//     g.fillOval(x, y, 10, 10);
//   }

//   class SampleWindowListener extends WindowAdapter
//   {
//     public void windowClosing(WindowEvent e)
//     {
//       System.exit(0);
//     }
//   }
//   class SampleMouseAdapter extends MouseAdapter
//   {
//     public void mousePressed(MouseEvent e)
//     {
//       x = e.getX();
//       y = e.getY();
//       repaint();
//     }
//   }
// }

import java.awt.*;
import java.awt.event.*;

class sample1 extends Frame implements Runnable
{
  int num;

  public static void main(String[] args)
  {
    sample1 sm = new sample1();
  }
  public sample1()
  {
    super("サンプル");

    addWindowListener(new SampleWindowListener());

    Thread th;
    th = new Thread(this);
    th.start();

    setSize(750, 600);
    setVisible(true);
  }
  public void run()
  {
    try{
      for(int i = 0; i < 10; i++)
      {
        num = i;
        repaint();
        Thread.sleep(1000);
      }
    }
    catch(InterruptedException e){}
  }
  public void paint(Graphics g)
  {
    String str = num + "です。";
    g.drawString(str, 100, 100);
  }

  class SampleWindowListener extends WindowAdapter
  {
    public void windowClosing(WindowEvent e)
    {
      System.exit(0);
    }
  }
}