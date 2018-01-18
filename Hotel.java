import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Hotel extends Applet implements ItemListener
{ 
Label l1,l2,l3,l4,l5,l6;
TextField t1,t2;
Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
public void init()
{
 l1=new Label("Available");
l2=new Label("Food");
l3=new Label("Drink");
l4=new Label("Selected");
l5=new Label("Food");
l6=new Label("Drink");

t1=new TextField(20);
t2=new TextField(20);

c1= new Checkbox("burger");
c2= new Checkbox("pizza");
c3= new Checkbox("sandwich");
c4= new Checkbox("hotdog");
c5= new Checkbox("veg roll");
c6= new Checkbox("coke");
c7= new Checkbox("pepsi");
c8= new Checkbox("7 up");
c9= new Checkbox("sprite");
c10= new Checkbox("mazza");

add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);
add(t1);add(t2);
add(c1);add(c2);add(c3);add(c4);add(c5);add(c6);add(c7);add(c8);add(c9);add(c10);
setLayout(null);

l1.setBounds(100,100,100,20);
l2.setBounds(100,140,100,20);

c1.setBounds(150,160,100,20);c2.setBounds(270,160,100,20);
c3.setBounds(390,160,100,20);c4.setBounds(510,160,100,20);c5.setBounds(630,160,100,20);


l3.setBounds(100,200,100,20);

c6.setBounds(150,220,100,20);c7.setBounds(270,220,100,20);
c8.setBounds(390,220,100,20);c9.setBounds(510,220,100,20);c10.setBounds(630,220,100,20);


l4.setBounds(630,220,100,20);
l5.setBounds(100,300,100,20);t1.setBounds(220,300,300,20);
l6.setBounds(100,340,100,20);t2.setBounds(220,340,300,20);


c1.addItemListener(this);c2.addItemListener(this);
c3.addItemListener(this);c4.addItemListener(this);
c5.addItemListener(this);c6.addItemListener(this);
c7.addItemListener(this);c8.addItemListener(this);
c9.addItemListener(this);c10.addItemListener(this);
}

public void itemStateChange(ItemEvent ie)
{
 String f=" " ,d=" ";
if(c1.getState()==true)
  f=f+c1.getLabel();
if(c2.getState()==true)
  f=f+c2.getLabel();
if(c3.getState()==true)
  f=f+c3.getLabel();
if(c4.getState()==true)
  f=f+c4.getLabel();
if(c5.getState()==true)
  f=f+c5.getLabel();
if(c6.getState()==true)
  d=d+c6.getLabel();
if(c7.getState()==true)
  d=d+c7.getLabel();
if(c8.getState()==true)
  d=d+c8.getLabel();
if(c9.getState()==true)
  d=d+c9.getLabel();
if(c10.getState()==true)
  d=d+c10.getLabel();
 
t1.setText(f);
t2.setText(d);
}
}
//<applet code=Hotel width=500 height=500>
//</applet>

















































