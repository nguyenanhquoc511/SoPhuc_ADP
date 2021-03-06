import java.util.*;
class Complex{
	double re, im;
	Complex(){
  		re=0;
  		im=0;
  	}
	
	Complex(double re, double im){
  		this.re=re;
  		this.im=im;
  	}
	
	Complex(double im){
  		this.re=0;
  		this.im=im;
  	}
	
	 public void input() {
		 Scanner sc =  new Scanner (System.in);
	       System.out.print("Nhap phan thuc: ");
	       this.re = sc.nextInt();
	       System.out.print("Nhap phan ao: ");
	       this.im = sc.nextInt();
	       
		
		
	}

	public String toString(){
		String s="";
		if(re==0 && im==0 ) s="0";
			if(re!=0) {
				if(im==0) s=String.valueOf(re);
				else s=String.valueOf(re);
			}
			if(im!=0){
				if (re!=0){
					if(im<0 && im!=-1) s+=" - "+String.valueOf(-im)+"i";
					else if(im==1) s+=" + i";
					else s+=" + "+ String.valueOf(im) + "i";
				}
				if(re==0){
					if(im<0 && im!=-1) s+=String.valueOf(im)+"i";
					else if(im==1) s+="i";
					else if(im==-1) s+="-i";
					else s+=String.valueOf(im) + "i";
				}
			}	
		return s;
	}
	 public  Complex sum(Complex c1, Complex c2) {
		 Complex s=new Complex();
		 s.re=c1.re+c2.re;
		 s.im=c1.im+c2.im;
		 return s;
	}
	 
	public  Complex sum(Complex c1,int x){
		Complex c2=new Complex(x);
		return sum(c1,c2);
	}

	public  Complex sum(int x,Complex c2 ){
		 Complex c1=new Complex(x);
		 return sum(c1,c2);
	}



	public  Complex diff(Complex c1,Complex c2) {
		Complex s=new Complex();
		s.re=c1.re-c2.re;
		s.im=c1.im-c2.im;
		return s;
	}
	 
	public  Complex diff(Complex c1,int x){
		Complex c2 = new Complex(x);
		return diff(c1,c2);
	}
	public  Complex diff(int x,Complex c1){
		Complex c2 = new Complex(x);
		return diff(c1,c2);
	}

	public  Complex area(Complex c1,Complex c2){
		Complex area=new Complex();
		area.re=c1.re*c2.re-c1.im*c2.im;
		area.im=c1.re*c2.im+c1.im*c2.re;
       
		return area; 
	}
	public  Complex area(Complex c1,int x){
		Complex c2 = new Complex(x);
		return area(c1,c2);

	}

	public  Complex area(int x,Complex c1 ){
		Complex c2 = new Complex(x);
		 return area(c1,c2);
	}


	 public  Complex quotient(Complex c1,Complex c2){
		Complex tam= new Complex();
	    tam.re=(1.0*(c1.re*c2.re+c1.im*c2.im)/(c2.re*c2.re+c2.im*c2.im));
            tam.im=(1.0*(-c1.re*c2.im+c1.im*c2.re)/(c2.re*c2.re+c2.im*c2.im));
            System.out.print(tam.re+"+"+tam.im+"i");
            return tam;
	}
	 public  Complex quotient(Complex c1,int x){
		Complex c2 = new Complex(x);
		return quotient(c1,c2);
	}
	 public  Complex quotient(int x, Complex c1){
		Complex c2 = new Complex(x);
		return area(c1,c2);
	}
} 

public class Input extends javax.swing.JFrame {
    Complex t=new Complex();
    public Input() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        im1 = new javax.swing.JTextField();
        re1 = new javax.swing.JTextField();
        im2 = new javax.swing.JTextField();
        re2 = new javax.swing.JTextField();
        cong = new javax.swing.JButton();
        tru = new javax.swing.JButton();
        nhan = new javax.swing.JButton();
        chia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        im1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        re1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        re1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re1ActionPerformed(evt);
            }
        });

        im2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        re2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        cong.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cong.setText("+");
        cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congActionPerformed(evt);
            }
        });

        tru.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tru.setText("-");
        tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truActionPerformed(evt);
            }
        });

        nhan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nhan.setText("*");
        nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanActionPerformed(evt);
            }
        });

        chia.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        chia.setText("/");
        chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("+");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("+");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel3.setText("i");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel4.setText("i");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Complex 2");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Complex 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cong)
                        .addGap(18, 18, 18)
                        .addComponent(tru)
                        .addGap(18, 18, 18)
                        .addComponent(nhan)
                        .addGap(18, 18, 18)
                        .addComponent(chia))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(re1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(im1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(re2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(im2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(im1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(re1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(im2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(re2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cong)
                    .addComponent(tru)
                    .addComponent(nhan)
                    .addComponent(chia))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        cong.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    double input(javax.swing.JTextField b){
        String st=b.getText();
        st=st.trim();
        for (int i=0;i<st.length();i++) 
            if (!((st.charAt(i)<='9' && st.charAt(i)>='0') || st.charAt(i)=='.')) {
                return 0;
            } 
        double t=0;
        if (st.compareTo("")!=0) t=Double.parseDouble(st);
        return t;
    }  
    


    void Display(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Results re=new Results();
                re.SetComplex(t);
                re.setVisible(true);
                re.output();
            }
        });
    }
    
    private void congActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congActionPerformed
        
        Complex t1= new Complex(input(re1),input(im1));
        Complex t2= new Complex(input(re2),input(im2));
        t=t.sum(t1,t2);
        Display();
//        output(re,t.re);
//        output(im,t.im);
    }//GEN-LAST:event_congActionPerformed

    private void truActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truActionPerformed
       
        Complex t1= new Complex(input(re1),input(im1));
        Complex t2= new Complex(input(re2),input(im2));
        t=t.diff(t1,t2);
        Display();
//        output(re,t.re);
//        output(im,t.im);
    }//GEN-LAST:event_truActionPerformed

    private void nhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanActionPerformed
       
        Complex t1= new Complex(input(re1),input(im1));
        Complex t2= new Complex(input(re2),input(im2));
        t=t.area(t1,t2);
        Display();
//        output(re,t.re);
//        output(im,t.im);
    }//GEN-LAST:event_nhanActionPerformed

    private void chiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiaActionPerformed
      
        Complex t1= new Complex(input(re1),input(im1));
        Complex t2= new Complex(input(re2),input(im2));
        t=t.quotient(t1,t2);
        Display();
//        output(re,t.re);
//        output(im,t.im);
    }//GEN-LAST:event_chiaActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void re1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_re1ActionPerformed
    void insert(javax.swing.JTextField w,String st){
        String s=w.getText();
        s+=st;
        w.setText(s);
    }
    void insert(int t, String st){
        System.out.println(t+" "+st);
        if (t==1){
            insert(re1,st);
            return;
        }
        if (t==2){
            insert(im1,st);
            return;
        }
        if (t==3){
            insert(re2,st);
            return;
        }
        if (t==4) insert(im2,st);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chia;
    private javax.swing.JButton cong;
    private javax.swing.JTextField im1;
    private javax.swing.JTextField im2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton nhan;
    private javax.swing.JTextField re1;
    private javax.swing.JTextField re2;
    private javax.swing.JButton tru;
    // End of variables declaration//GEN-END:variables
}
