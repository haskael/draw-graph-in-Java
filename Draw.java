import javax.swing.*;
import java.awt.event.*;
import java.awt.Canvas;
import java.awt.*;
import java.lang.Math;
import java.util.*;

//import java.awt.Graphics2D;
public class Draw {
    public static JFrame frame = new JFrame("计算机图形学上机实验");

    public void drawGraph() {
        // 函数主体
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setVisible(true);
        // 设置面板
        JPanel methods = new JPanel();
        frame.add(methods);
        // 设置按钮
        JButton dda = new JButton("DDA");
        JButton bresenham = new JButton("Bresenham");
        JButton circle = new JButton("Midpoint-Circle");
        JButton oval = new JButton("Oval");
        methods.add(dda);
        methods.add(bresenham);
        methods.add(circle);
        methods.add(oval);
        // 设置弹出式输入框
        dda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame ddaInputFrame = new JFrame("请输入算法参数");
                ddaInputFrame.setVisible(true);
                ddaInputFrame.setSize(210, 150);
                JPanel ddaInput = new JPanel();

                ddaInputFrame.add(ddaInput);

                JTextField x1Field = new JTextField(5);
                JTextField y1Field = new JTextField(5);
                JTextField x2Field = new JTextField(5);
                JTextField y2Field = new JTextField(5);

                ddaInput.add(new JLabel("x1:"));
                ddaInput.add(x1Field);
                ddaInput.add(Box.createHorizontalStrut(5)); // a spacer
                ddaInput.add(new JLabel("y1:"));
                ddaInput.add(y1Field);
                ddaInput.add(new JLabel("x2:"));
                ddaInput.add(x2Field);
                ddaInput.add(Box.createHorizontalStrut(5)); // a spacer
                ddaInput.add(new JLabel("y2:"));
                ddaInput.add(y2Field);
                JButton ddaOK = new JButton("确定");
                JButton ddaCancel = new JButton("取消");
                ddaInput.add(ddaOK);
                ddaInput.add(ddaCancel);

                ddaOK.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int x1, x2, y1, y2;
                        x1 = Integer.parseInt(x1Field.getText());
                        x2 = Integer.parseInt(x2Field.getText());
                        y1 = Integer.parseInt(y1Field.getText());
                        y2 = Integer.parseInt(y2Field.getText());
                        DdaTest ddatest = new DdaTest(x1, x2, y1, y2);
                        // new ddaTest();
                        ddaInputFrame.dispose();
                    }
                });

            }
        });// dda ActionListener finished here.

        bresenham.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame bresenhamInputFrame = new JFrame("请输入算法参数");
                bresenhamInputFrame.setVisible(true);
                bresenhamInputFrame.setSize(210, 150);
                JPanel bresenhamInput = new JPanel();

                bresenhamInputFrame.add(bresenhamInput);

                JTextField x1Field = new JTextField(5);
                JTextField y1Field = new JTextField(5);
                JTextField x2Field = new JTextField(5);
                JTextField y2Field = new JTextField(5);

                bresenhamInput.add(new JLabel("x1:"));
                bresenhamInput.add(x1Field);
                bresenhamInput.add(Box.createHorizontalStrut(5)); // a spacer
                bresenhamInput.add(new JLabel("y1:"));
                bresenhamInput.add(y1Field);
                bresenhamInput.add(new JLabel("x2:"));
                bresenhamInput.add(x2Field);
                bresenhamInput.add(Box.createHorizontalStrut(5)); // a spacer
                bresenhamInput.add(new JLabel("y2:"));
                bresenhamInput.add(y2Field);
                JButton bresenhamOK = new JButton("确定");
                JButton bresenhamCancel = new JButton("取消");
                bresenhamInput.add(bresenhamOK);
                bresenhamInput.add(bresenhamCancel);

                bresenhamOK.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int x1, x2, y1, y2;
                        x1 = Integer.parseInt(x1Field.getText());
                        x2 = Integer.parseInt(x2Field.getText());
                        y1 = Integer.parseInt(y1Field.getText());
                        y2 = Integer.parseInt(y2Field.getText());
                        BresenhamTest bresenhamtest = new BresenhamTest(x1, x2, y1, y2);
                        bresenhamInputFrame.dispose();
                    }
                });

            }
        });// bresenham ActionListener finished here.

        circle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame circleInputFrame = new JFrame("请输入算法参数");
                circleInputFrame.setVisible(true);
                circleInputFrame.setSize(350, 150);
                JPanel circleInput = new JPanel();

                circleInputFrame.add(circleInput);

                JTextField x1Field = new JTextField(5);
                JTextField y1Field = new JTextField(5);
                JTextField rField = new JTextField(5);

                circleInput.add(new JLabel("x1:"));
                circleInput.add(x1Field);
                circleInput.add(Box.createHorizontalStrut(5)); // a spacer
                circleInput.add(new JLabel("y1:"));
                circleInput.add(y1Field);
                circleInput.add(Box.createHorizontalStrut(5)); // a spacer
                circleInput.add(new JLabel("radius:"));
                circleInput.add(rField);
                JButton circleOK = new JButton("确定");
                JButton circleCancel = new JButton("取消");
                circleInput.add(circleOK);
                circleInput.add(circleCancel);

                circleOK.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int x1, y1, radius;
                        x1 = Integer.parseInt(x1Field.getText());
                        y1 = Integer.parseInt(y1Field.getText());
                        radius = Integer.parseInt(rField.getText());
                        CircleTest circletest = new CircleTest(x1, y1, radius);
                        circleInputFrame.dispose();
                    }
                });

            }
        });// circle ActionListener finished here.

        oval.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame ovalInputFrame = new JFrame("请输入算法参数");
                ovalInputFrame.setVisible(true);
                ovalInputFrame.setSize(210, 150);
                JPanel ovalInput = new JPanel();

                ovalInputFrame.add(ovalInput);

                JTextField x1Field = new JTextField(5);
                JTextField y1Field = new JTextField(5);
                JTextField rxField = new JTextField(5);
                JTextField ryField = new JTextField(5);

                ovalInput.add(new JLabel("x1:"));
                ovalInput.add(x1Field);
                ovalInput.add(Box.createHorizontalStrut(5)); // a spacer
                ovalInput.add(new JLabel("y1:"));
                ovalInput.add(y1Field);
                ovalInput.add(new JLabel("rx:"));
                ovalInput.add(rxField);
                ovalInput.add(Box.createHorizontalStrut(5)); // a spacer
                ovalInput.add(new JLabel("ry:"));
                ovalInput.add(ryField);
                JButton ovalOK = new JButton("确定");
                JButton ovalCancel = new JButton("取消");
                ovalInput.add(ovalOK);
                ovalInput.add(ovalCancel);

                ovalOK.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int x1, y1, rx, ry;
                        x1 = Integer.parseInt(x1Field.getText());
                        rx = Integer.parseInt(rxField.getText());
                        y1 = Integer.parseInt(y1Field.getText());
                        ry = Integer.parseInt(ryField.getText());
                        OvalTest ovaltest = new OvalTest(x1, y1, rx, ry);
                        ovalInputFrame.dispose();
                    }
                });

            }
        });// oval ActionListener finished here.

    }

    // 以下为具体算法实现
    // DDA
    public class DdaTest extends JFrame {
        /**
         *
         */
        private int x1, x2, y1, y2, d;
        private double x, y;
        private double m;
        private static final long serialVersionUID = 1L;
        private Canvas ddaCanvas = new Canvas() {
            @Override
            public void paint(Graphics g) {
                int i;
                super.paint(g);
                g = this.getGraphics();
                setVisible(true);
                g.translate(250,250);
                g.setColor(Color.black);
                g.drawLine(-500, 0, 500, 0);
                g.drawLine(0, -500, 0, 500);// 绘制坐标系x轴y轴
                for(i=-5;i<=5;i++){
                    g.fillOval(i*100-2,-2,4,4);
                    g.fillOval(-2,i*100-2,4,4);
                }
                setStrokewidth(2.0);
                g.setColor(Color.pink);
                System.out.println(m);
                if (Math.abs(m) <= 1 ) {
                    for (i=0;i<= Math.abs((x2-x1));i++){
                        System.out.println("i1 = "+i);
                        System.out.println(x);
                        System.out.println(y);
                        g.drawLine((int) Math.round(x), (int) Math.round(-y), (int) Math.round(x), (int) Math.round(-y));
                        //g.fillRect((int) Math.round(x), (int) Math.round(y), 1, 1);
                        x = x + 1;
                        y = y + m;
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                } else {
                    for (i=0;i<= Math.abs(y2-y1);i++){
                        System.out.println("i2 = "+i);
                        System.out.println(x);
                        System.out.println(y);
                        g.drawLine((int) Math.round(x), (int) Math.round(-y), (int) Math.round(x), (int) Math.round(-y));
                        //g.fillRect((int) Math.round(x), (int) Math.round(y), 1, 1);
                        y = y + 1;
                        x = x + 1 / m;
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }
        }
    
    }; 

        public DdaTest(int x1, int x2, int y1, int y2) {
            this.m = (double) (y1 - y2) / (double) (x1 - x2);
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
            if (Math.abs(m)<1){
                if(x1<x2){
                    this.x = (double)x1;
                    this.y = (double)y1;
                }
                else{
                    this.x = (double)x2;
                    this.y = (double)y2;
                }
            }
            else{
                if(y1<y2){
                    this.x = (double)x1;
                    this.y = (double)y1;
                }
                else{
                    this.x = (double)x2;
                    this.y = (double)y2;
                }
            }
            this.setSize(500,500);
            this.setVisible(true);
            this.add(ddaCanvas);
            Graphics g = ddaCanvas.getGraphics();
            //ddaCanvas.paint(g);
        };

}
    
    public class BresenhamTest extends JFrame {
        private int x1, x2, y1, y2, d;
        private double x, y;
        private double m,p;
        private int dx,dy;

        private Canvas bresenhamCanvas = new Canvas() {
            @Override
            public void paint(Graphics g) {
                int i;
                super.paint(g);
                g = this.getGraphics();
                setVisible(true);
                g.translate(250,250);
                g.setColor(Color.black);
                g.drawLine(-250, 0, 250, 0);
                g.drawLine(0, -250, 0, 250);// 绘制坐标系x轴y轴
                g.setColor(Color.green);
                System.out.println(m);
                if (Math.abs(m)<=1) {
                    p = 2 * dy - dx;
                    for(i=0;i<=dx;i++){
                        System.out.println("("+x+","+y+")");
                        if (p<0){
                            x = x + 1;
                            p = p + 2*dy;
                        }
                        else {
                            p = p + 2*dy - 2*dx;
                            x = x + 1;
                            y = y + d;
                        }
                        g.drawLine((int) Math.round(x), (int) Math.round(-y), (int) Math.round(x), (int) Math.round(-y));
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();}
                    }
                }
                else {
                    p = 2 * dx - dy;
                    for(i=0;i<=dy;i++){
                        System.out.println("("+x+","+y+")");
                        if (p<0){
                            y = y + 1;
                            p = p + 2*dx;
                        }
                        else {
                            y = y + 1;
                            x = x + d;
                            p = p + 2*dx - 2*dy;
                        }
                        g.drawLine((int) Math.round(x), (int) Math.round(-y), (int) Math.round(x), (int) Math.round(-y));
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();}
                    }
                }
            }
        };

        public BresenhamTest(int x1, int x2, int y1, int y2) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = -y1;
            this.y2 = -y2;
            this.m = (double) (y1 - y2) / (double) (x1 - x2);
            if (Math.abs(m)<1){
                if(x1<x2){
                    this.x = (double)x1;
                    this.y = (double)y1;
                }
                else{
                    this.x = (double)x2;
                    this.y = (double)y2;
                }
            }
            else{
                if(y1<y2){
                    this.x = (double)x1;
                    this.y = (double)y1;
                }
                else{
                    this.x = (double)x2;
                    this.y = (double)y2;
                }
            }
            this.dx = Math.abs( x1 - x2);
            this.dy = Math.abs( y1 - y2);
            if (m<0) this.d=-1;
            else this.d = 1;
            this.setSize(500,500);
            this.setVisible(true);
            this.add(bresenhamCanvas);
            Graphics g = bresenhamCanvas.getGraphics();
        };
    }
    
    public class CircleTest extends JFrame {
        private int x1, y1, r;
        private double x, y;
        private double p;

        private Canvas circleCanvas = new Canvas() {
            @Override
            public void paint(Graphics g) {
                int i;
                super.paint(g);
                g = this.getGraphics();
                setVisible(true);
                g.translate(250,250);
                g.setColor(Color.black);
                g.drawLine(-250, 0, 250, 0);
                g.drawLine(0, -250, 0, 250);// 绘制坐标系x轴y轴
                g.setColor(Color.red);
                while(x<y){
                    if (p<0){
                        x = x + 1;
                        p = p + 2*x + 1;
                    }
                    else {
                        x = x + 1;
                        y = y - 1;
                        p = p + 2*x + 1 - 2*y;
                    }
                    g.drawLine((int) Math.round(x+x1), (int) Math.round(-y-y1), (int) Math.round(x+x1), (int) Math.round(-y-y1));
                    g.drawLine((int) Math.round(-x+x1), (int) Math.round(-y-y1), (int) Math.round(-x+x1), (int) Math.round(-y-y1));
                    g.drawLine((int) Math.round(x+x1), (int) Math.round(y-y1), (int) Math.round(x+x1), (int) Math.round(y-y1));
                    g.drawLine((int) Math.round(-x+x1), (int) Math.round(y-y1), (int) Math.round(-x+x1), (int) Math.round(y-y1));

                    g.drawLine((int) Math.round(y+x1), (int) Math.round(-x-y1), (int) Math.round(y+x1), (int) Math.round(-x-y1));
                    g.drawLine((int) Math.round(-y+x1), (int) Math.round(-x-y1), (int) Math.round(-y+x1), (int) Math.round(-x-y1));
                    g.drawLine((int) Math.round(y+x1), (int) Math.round(x-y1), (int) Math.round(y+x1), (int) Math.round(x-y1));
                    g.drawLine((int) Math.round(-y+x1), (int) Math.round(x-y1), (int) Math.round(-y+x1), (int) Math.round(x-y1));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }
            }
        };

        public CircleTest(int x1, int y1, int radius) {
            this.x1 = x1;
            this.y1 = y1;
            this.x = 0.0;
            this.y = (double) radius;
            this.r = radius;
            this.p = 1.25 - radius;
            this.setSize(500,500);
            this.setVisible(true);
            this.add(circleCanvas);
            Graphics g = circleCanvas.getGraphics();
        };

    }

    public class OvalTest extends JFrame {
        private int x1, y1, rx, ry;
        private double x, y;
        private double p;

        private Canvas ovalCanvas = new Canvas() {
            @Override
            public void paint(Graphics g) {
                int i;
                super.paint(g);
                g = this.getGraphics();
                setVisible(true);
                g.translate(250,250);
                g.setColor(Color.black);
                g.drawLine(-250, 0, 250, 0);
                g.drawLine(0, -250, 0, 250);// 绘制坐标系x轴y轴
                g.setColor(Color.red);
                while (ry*ry*x < rx*rx*y) {
                    System.out.println("("+x+","+y+")");
                    g.drawLine((int) Math.round(x+x1), (int) Math.round(-y-y1), (int) Math.round(x+x1), (int) Math.round(-y-y1));
                    g.drawLine((int) Math.round(-x+x1), (int) Math.round(-y-y1), (int) Math.round(-x+x1), (int) Math.round(-y-y1));
                    g.drawLine((int) Math.round(x+x1), (int) Math.round(y-y1), (int) Math.round(x+x1), (int) Math.round(y-y1));
                    g.drawLine((int) Math.round(-x+x1), (int) Math.round(y-y1), (int) Math.round(-x+x1), (int) Math.round(y-y1));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    if (p<0){
                        x = x + 1;
                        p = p + 2*ry*ry*x + ry*ry;
                    }
                    else {
                        x = x + 1;
                        y = y - 1;
                        p = p + 2*ry*ry*x - 2*rx*rx*y + ry*ry;
                    }
                }
                p = ry*ry*(x+0.5)*(x+0.5) + rx*rx*(y-1)*(y-1) - rx*rx*ry*ry;
                while (y>=0){
                    System.out.println("("+x+","+y+")");
                    g.drawLine((int) Math.round(x+x1), (int) Math.round(-y-y1), (int) Math.round(x+x1), (int) Math.round(-y-y1));
                    g.drawLine((int) Math.round(-x+x1), (int) Math.round(-y-y1), (int) Math.round(-x+x1), (int) Math.round(-y-y1));
                    g.drawLine((int) Math.round(x+x1), (int) Math.round(y-y1), (int) Math.round(x+x1), (int) Math.round(y-y1));
                    g.drawLine((int) Math.round(-x+x1), (int) Math.round(y-y1), (int) Math.round(-x+x1), (int) Math.round(y-y1));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    if (p>0){
                        y = y - 1;
                        p = p - 2*rx*rx*y + rx*rx;
                    }
                    else {
                        x = x + 1;
                        y = y - 1;
                        p = p + 2*ry*ry*x - 2*rx*ry*y + rx*rx;
                    }   
                }
            }
        };

        public OvalTest(int x1, int y1, int rx, int ry){
            this.x1 = x1;
            this.y1 = y1;
            this.rx = rx;
            this.ry = ry;
            this.x = 0.0;
            this.y = (double) ry;
            this.p = ry*ry - rx*rx*ry + rx*rx/4;
            this.setSize(500,500);
            this.setVisible(true);
            this.add(ovalCanvas);
            Graphics g = ovalCanvas.getGraphics();
        }
    }
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                Draw draw1 = new Draw();
                draw1.drawGraph();
            }
        });
    }
}