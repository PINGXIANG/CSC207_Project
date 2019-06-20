
//LoginListener的类



import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;



//监听事件

public class LoginListener implements ActionListener{



    private javax.swing.JTextField jt;//账号输入框对象

    private javax.swing.JPasswordField jp;//密码输入框对象







    private javax.swing.JFrame login;//定义一个窗体对象

    public LoginListener(javax.swing.JFrame login,javax.swing.JTextField jt,javax.swing.JPasswordField jp) {

        this.login=login;//获取登录界面

        this.jt=jt;//获取登录界面中的账号输入框对象

        this.jp=jp;//获取登录界面中的密码输入框对象

    }



    public void actionPerformed(ActionEvent e) {

        //利用get方法来获取账号和密码对象的文本信息，并用equal方法进行判断。最好不要用==，用==这个地方验证不过去。

        if(jt.getText().equals("baibizhe")&&jp.getText().equals("byl95899589")) {



            //满足条件，则生成一个新的界面

            javax.swing.JFrame jf=new javax.swing.JFrame();

            jf.setTitle("登录后的用户界面");

            jf.setSize(340,500);//只对顶级容器有效

            jf.setDefaultCloseOperation(3);//窗体关闭时结束程序

            jf.setLocationRelativeTo(null);//居中

            jf.setResizable(false);

            jf.setVisible(true);



            // 通过我们获取的登录界面对象，用dispose方法关闭它

            login.dispose();

        }
        else {
            javax.swing.JFrame jf=new javax.swing.JFrame();

            jf.setTitle("2222");

            jf.setSize(340,500);//只对顶级容器有效

            jf.setDefaultCloseOperation(3);//窗体关闭时结束程序

            jf.setLocationRelativeTo(null);//居中

            jf.setResizable(false);

            jf.setVisible(true);
            }

    }

}
