import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class GUI extends JFrame {

    private JFrame mainFrame;
    private JButton park;
    private JButton equipt;
    private JButton comp;
    private JButton houses;
    private JButton fee;
    private JButton fix;

    private JFrame parkFrame;
    private JButton temppark;
    private JButton rentpark;
    private JButton boughtpark;

    private JFrame search;

    private void run(){
        mainFrame = new JFrame("物业管理系统");
        mainFrame.setLocation(200,100);
        mainFrame.setSize(500,500);
        mainFrame.getContentPane().setLayout(null);
        mainFrame.add(getPark());
        mainFrame.add(getEquipt());
        mainFrame.add(getComp());
        mainFrame.add(getHouses());
        mainFrame.add(getFix());
        mainFrame.add(getFee());

        parkFrame = new JFrame("车位管理");
        parkFrame.setLocation(500,100);
        parkFrame.setSize(500,500);
        parkFrame.getContentPane().setLayout(null);
        parkFrame.add(getTemppark());
        parkFrame.add(getRentpark());
        parkFrame.add(getBoughtpark());

        search = new JFrame("设备管理");
        search.setLocation(500,300);
        search.setSize(500,500);


        mainFrame.setVisible(true);
        parkFrame.setVisible(true);
        search.setVisible(true);
    }

    private JButton getPark(){
        park = new javax.swing.JButton("停车管理");
        park.setBounds(80,80,150,80);
        return park;
    }

    private JButton getEquipt(){
        equipt = new javax.swing.JButton("设备管理");
        equipt.setBounds(280,80,150,80);
        return equipt;
    }
    private JButton getComp(){
        comp = new javax.swing.JButton("投诉处理");
        comp.setBounds(80,200,150,80);
        return comp;
    }

    private JButton getHouses(){
        houses = new javax.swing.JButton("住户管理");
        houses.setBounds(280,200,150,80);
        return houses;
    }

    private JButton getFee(){
        fee = new javax.swing.JButton("费用管理");
        fee.setBounds(280,320,150,80);
        return fee;
    }

    private JButton getFix(){
        fix = new javax.swing.JButton("报修处理");
        fix.setBounds(80,320,150,80);
        return fix;
    }


    private JButton getTemppark(){
        temppark = new javax.swing.JButton("临时停车");
        temppark.setBounds(80,50,100,50);
        return temppark;
    }

    private JButton getRentpark(){
        rentpark = new javax.swing.JButton("租用车位");
        rentpark.setBounds(80,200,100,50);
        return rentpark;
    }

    private JButton getBoughtpark(){
        boughtpark = new javax.swing.JButton("购用车位");
        boughtpark.setBounds(80,350,100,50);
        return boughtpark;
    }

    public static void main(String[] args){
        GUI test = new GUI();
        test.run();
    }
}
