import javax.swing.*;

import java.util.*;

import java.sql.*;

import java.awt.*;

import java.awt.event.*;

public class MainPortal implements ActionListener{

    //These are the instance variables

    String year, month, day;

    private boolean error;

    private boolean duplicated;

    JFrame frame;

    JPanel panel;

    JTextField fullvacan;

    JTextField fulldesg;

    JComboBox cb;

    JTextField fullsal;

    JTextField fullwor;

    JButton button;

    JTextField fulappoinvac;

    JTextField fulstafnam;

    JTextField fulquali;

    JComboBox fcb;

    JComboBox cb1;

    JComboBox cb2;

    JTextField fulappoinby;

    JButton appointfullbutton;

    JTextField partvacno;

    JTextField partdesg;

    JComboBox cbb;

    JComboBox sbb;

    JTextField partworhr;

    JTextField partwage;

    JButton addpartbutton;

    JTextField parappoinvac;

    JTextField parstaffname;

    JTextField parqualific;

    JComboBox cbp1;

    JComboBox cbp2;

    JComboBox cbp3;

    JTextField parappoin;

    JButton appoipartbut;

    JTextField vacanTer;

    JButton terminatebut;

    JButton clearBut;

    JButton disbutton;

   

    //Arraylist to store the value

    ArrayList<StaffHire> list = new ArrayList<StaffHire>();

   

    public void report(){

        frame = new JFrame("Staff Registration Form");//

        frame.setVisible(true); //It makes all the tab visible      

        frame.setResizable(false);//Frame cannaot be resize

        frame.setBounds(50,20,830,780);//It helps to make size and location

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Exits all the background running process

       

        panel = new JPanel();

        panel.setLayout(null);//This will not contain any layout

        frame.add(panel);//Adding panel to the frame

       

        //MAking the Gui by adding Textfield, label and combobox

        JLabel title3 = new JLabel();

        title3.setText("For Full-Time Staff");

        title3.setBounds(310, 25, 250, 25);;

        Font f1 = new Font("Arial", Font.PLAIN, 26);

        title3.setFont(f1);

        panel.add(title3);

 

        JLabel vacancyNo = new JLabel("VacancyNo:");

        vacancyNo.setBounds(30, 50, 180, 40);

        fullvacan= new JTextField();

        fullvacan.setBounds(140, 60, 100, 20);

        panel.add(vacancyNo);

        panel.add(fullvacan);

       

        JLabel designation = new JLabel("Designation:");

        designation.setBounds(550, 50, 130, 40);

        fulldesg = new JTextField();

        fulldesg.setBounds(650, 60, 100, 20);

        panel.add(designation);

        panel.add(fulldesg);

       

        JLabel jobType = new JLabel("Job Type:");

        jobType.setBounds(350,50,180,40);

        String type[] = {"Full-Time","Part-Time",};

        cb = new JComboBox(type);

        cb.setBounds(420,60,100,20);

        panel.add(jobType);

        panel.add(cb);

       

        JLabel salary = new JLabel("Salary:");

        salary.setBounds(600, 110, 110, 20);

        fullsal = new JTextField();

        fullsal.setBounds(650, 110, 100, 20);

        panel.add(salary);

        panel.add(fullsal);

       

        JLabel workingHour = new JLabel("WorkingHour:");

        workingHour.setBounds(30, 100, 180, 40);

        fullwor = new JTextField();

        fullwor.setBounds(140, 110, 100, 20);

        panel.add(workingHour);

        panel.add(fullwor);

       

        button = new JButton("Add Vacancy For Full Time Staff");

        button.setEnabled(true);

        button.addActionListener(this);

        button.setBounds(280, 120, 280, 25);

        panel.add(button);

        //yofirst part

        

        //////////////

        JLabel fvacancyNo = new JLabel("VacancyNo:");

        fvacancyNo.setBounds(30, 190, 180, 40);

        fulappoinvac = new JTextField();

        fulappoinvac.setBounds(140, 200, 100, 20);

        panel.add(fvacancyNo);

        panel.add(fulappoinvac);

       

        JLabel staffName = new JLabel("StaffName:");

        staffName.setBounds(600, 190, 180, 40);

        fulstafnam = new JTextField();

        fulstafnam.setBounds(700, 200, 100, 20);

        panel.add(staffName);

        panel.add(fulstafnam);

       

        JLabel qualification = new JLabel("Qualification:");

        qualification.setBounds(30, 240, 180, 40);

        fulquali = new JTextField();

        fulquali.setBounds(135, 250, 100, 20);;

        panel.add(qualification);

        panel.add(fulquali);

       

        JLabel joiningDate = new JLabel("JoiningDate:");

        joiningDate.setBounds(250,190,180,40);

        String year[] = {"Year","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};

        String month[] = {"Month","jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        String day[] = {"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};

        fcb = new JComboBox(year);

        cb1 = new JComboBox(month);

        cb2 = new JComboBox(day);

        fcb.setBounds(370,200,75,20);

        cb1.setBounds(440,200,65,20);

        cb2.setBounds(505,200,63,20);

        panel.add(joiningDate);

        panel.add(fcb);

        panel.add(cb1);

        panel.add(cb2);

       

        JLabel appointedBy = new JLabel("AppointedBy:");

        appointedBy.setBounds(600, 240, 180, 40);

        fulappoinby = new JTextField();

        fulappoinby.setBounds(700, 250, 100, 20);

        panel.add(appointedBy);

        panel.add(fulappoinby);

       

        appointfullbutton = new JButton("Appoint FullTime Staff");

        appointfullbutton.setEnabled(true);

        appointfullbutton.setBounds(320, 260, 200, 25);;

        appointfullbutton.addActionListener(this);

        panel.add(appointfullbutton);

        ///////////HALFFPART SAKYO/

       

        JLabel title4 = new JLabel();

        title4.setText("For Part-Time Staff");

        title4.setBounds(300, 310, 400, 40);

        Font f2 = new Font("Arial", Font.PLAIN, 26);

        title4.setFont(f2);

        panel.add(title4);       

 

        JLabel pvacancyNo = new JLabel("VacancyNo:");

        pvacancyNo.setBounds(45, 340, 180, 40);

        partvacno = new JTextField();

        partvacno.setBounds(140, 350, 100, 20);

        panel.add(pvacancyNo);

        panel.add(partvacno);

        

        JLabel pdesignation = new JLabel("Designation:");

        pdesignation.setBounds(550, 390, 180, 40);

        partdesg = new JTextField();

        partdesg.setBounds(670, 400, 110, 20);

        panel.add(pdesignation);

        panel.add(partdesg);

       

        JLabel pjobType = new JLabel("Job Type:");

        pjobType.setBounds(330,390,180,40);

        String ptype[] = {"Full-Time","Part-Time",};

        cbb = new JComboBox(ptype);

        cbb.setBounds(400,400,100,20);

        panel.add(pjobType);

        panel.add(cbb);

       

                

        JLabel pshift = new JLabel ("Shift:");

        pshift.setBounds(330,340,180,40);

        String shift[] = {"Morning","Day","Night"};

        sbb = new JComboBox(shift);

        sbb.setBounds(390,350,100,20);

        panel.add(pshift);

        panel.add(sbb);

 

       

        

        JLabel pworkingHour = new JLabel("WorkingHour:");

        pworkingHour.setBounds(45, 390, 180, 40);

        partworhr = new JTextField();

        partworhr.setBounds(150, 400, 100, 20);

        panel.add(pworkingHour);

        panel.add(partworhr);

       

                

        JLabel pwages = new JLabel("WagesPerHour:");

        pwages.setBounds(560, 340, 180, 40);

        partwage = new JTextField();

        partwage.setBounds(680, 350, 110, 20);

        panel.add(pwages);

        panel.add(partwage);

       

        addpartbutton = new JButton("Add Vacancy For Part Time Staff");

        addpartbutton.setEnabled(true);

        addpartbutton.addActionListener(this);

        addpartbutton.setBounds(295, 450, 300, 25);

        panel.add(addpartbutton);

        /////////////

          //final part/

        JLabel ppvacancyNo = new JLabel("VacancyNo:");

        ppvacancyNo.setBounds(45, 510, 180, 40);

        parappoinvac = new JTextField();

        parappoinvac.setBounds(140, 520, 100, 20);

        panel.add(ppvacancyNo);

        panel.add(parappoinvac);

       

        JLabel pstaffName = new JLabel("StaffName:");

        pstaffName.setBounds(600, 510, 180, 40);

        parstaffname= new JTextField();

        parstaffname.setBounds(690, 520, 100, 20);

        panel.add(pstaffName);

        panel.add(parstaffname);

       

        JLabel pqualification = new JLabel("Qualification:");

        pqualification.setBounds(45, 560, 150, 40);

        parqualific = new JTextField();

        parqualific.setBounds(140, 570, 100, 20);

        panel.add(pqualification);

        panel.add(parqualific);

 

        JLabel pjoiningDate = new JLabel("JoiningDate:");

        pjoiningDate.setBounds(250,510,180,40);

        cbp1 = new JComboBox(year);

        cbp2 = new JComboBox(month);

        cbp3= new JComboBox(day);

        cbp1.setBounds(350,520,75,20);

        cbp2.setBounds(420,520,65,20);

        cbp3.setBounds(490,520,63,20);

        panel.add(pjoiningDate);

        panel.add(cbp1);

        panel.add(cbp2);

        panel.add(cbp3);

       

        JLabel pappointedBy = new JLabel("AppointedBy:");

        pappointedBy.setBounds(600, 560, 150, 40);

        parappoin = new JTextField();

        parappoin.setBounds(700, 570, 100, 20);

        panel.add(pappointedBy);

        panel.add(parappoin);

        

        appoipartbut = new JButton("Appoint partTime Staff");

        appoipartbut.setEnabled(true);

        appoipartbut.addActionListener(this);

        appoipartbut.setBounds(265, 590, 300, 25);

        panel.add(appoipartbut);

       

        JLabel tvacancyNo = new JLabel("VacancyNo:");

        tvacancyNo.setBounds(45, 630, 180, 40);

        vacanTer= new JTextField();

        vacanTer.setBounds(140, 640, 100, 20);

        panel.add(tvacancyNo);

        panel.add(vacanTer);

       

        terminatebut = new JButton("Terminate");

        terminatebut.setEnabled(true);

        terminatebut.setBounds(600, 660, 130, 25);

        terminatebut.addActionListener(this);

        panel.add(terminatebut);

       

        clearBut = new JButton("Clear");

        clearBut.setEnabled(true);

        clearBut.setBounds(45, 700, 100, 45);;

        clearBut.addActionListener(this);

        panel.add(clearBut);         

        

        disbutton = new JButton("Display");

        disbutton.setEnabled(true);

        disbutton.setBounds(620, 700, 100, 45);

        disbutton.addActionListener(this);

        panel.add(disbutton); 

        

        

 

        //for button font

        Font fbtn = new Font("Arial",Font.PLAIN, 16);

        //adding font to the respective buttons

        button.setFont(fbtn);

        appointfullbutton.setFont(fbtn);

        addpartbutton.setFont(fbtn);

        clearBut.setFont(fbtn);

        disbutton.setFont(fbtn);

        appoipartbut.setFont(fbtn);

        terminatebut.setFont(fbtn);

       

        //for textfont

        Font tbtn = new Font("Arial",Font.BOLD, 14);

        //adding font for the labels

        vacancyNo.setFont(tbtn);

        jobType.setFont(tbtn);

        designation.setFont(tbtn);

        salary.setFont(tbtn);

        workingHour.setFont(tbtn);

        fvacancyNo.setFont(tbtn);

        qualification.setFont(tbtn);

        joiningDate.setFont(tbtn);

        staffName.setFont(tbtn);

        appointedBy.setFont(tbtn);

        pvacancyNo.setFont(tbtn);

        pjobType.setFont(tbtn);

        pdesignation.setFont(tbtn);

        pshift.setFont(tbtn);

        pwages.setFont(tbtn);

        pworkingHour.setFont(tbtn);

        ppvacancyNo.setFont(tbtn);

        pstaffName.setFont(tbtn);

        pqualification.setFont(tbtn);

        pjoiningDate.setFont(tbtn);

        pappointedBy.setFont(tbtn);

        tvacancyNo.setFont(tbtn);

       

        //This is a background colour property

        Color color = new Color(240, 240, 240);

        panel.setBackground(color);

    }

    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==button){

            try{

                error = false;

                duplicated = false;

                int vacancyNo = Integer.parseInt(fullvacan.getText());

                String designation = fulldesg.getText();

                String jobType = cb.getSelectedItem().toString();

                int salary = Integer.parseInt(fullsal.getText());

                int workingHour = Integer.parseInt(fullwor.getText());

                if( fulldesg.getText().isEmpty() || cb.getSelectedItem().toString().isEmpty()){

                    error = true;

                    JOptionPane.showMessageDialog(frame, "Empty field found");

                }

                else if (fullvacan.getText().isEmpty() ||fullsal.getText().isEmpty() || fullwor.getText().isEmpty()){

                    error = true;

                    JOptionPane.showMessageDialog(frame, "Empty field found");

                }

                else if (cb.getSelectedItem().toString()== "Part-Time"){

                    error = true;

                    JOptionPane.showMessageDialog(frame,"Job-Type invalid");

                }

                for(StaffHire var:list) {

                    if(var.getVacancy_no()==vacancyNo){

                        duplicated=true;

                        break;

                    }

                }

                if(error == false && duplicated == false){

                FullTimeStaffHire ftsh = new FullTimeStaffHire (vacancyNo, designation, jobType, salary, workingHour);

                list.add(ftsh);

                JOptionPane.showMessageDialog(frame,"Full Time staff added!");

                }

                else{

                    JOptionPane.showMessageDialog(frame, "Full-Time staff is already hired");

                }

            }

            catch(Exception ex){

            JOptionPane.showMessageDialog(frame, "Invalid Input");

            }

        }  

        if(e.getSource()==addpartbutton){

            try{

                error = false;

                duplicated = false;

                int vacancy_no = Integer.parseInt(partvacno.getText());

                String designation = partdesg.getText();

                String jobType = cbb.getSelectedItem().toString();

                int wagesPerHour = Integer.parseInt(partwage.getText());

                int workingHour = Integer.parseInt(partworhr.getText());

                String shifts = sbb.getSelectedItem().toString();

                if( partdesg.getText().isEmpty() || cbb.getSelectedItem().toString().isEmpty() || sbb.getSelectedItem().toString().isEmpty()){

                    error = true;

                    JOptionPane.showMessageDialog(frame, "Empty field found");

                }

                else if (partvacno.getText().isEmpty() ||partwage.getText().isEmpty() || partworhr.getText().isEmpty()){

                    error = true;

                    JOptionPane.showMessageDialog(frame, "Empty field found");

                }

                else if (sbb.getSelectedItem().toString()== "Full-Time"){

                    error = true;

                    JOptionPane.showMessageDialog(frame,"Job-Type invalid");

                }

                for(StaffHire var:list) {

                    if(var.getVacancy_no()==vacancy_no){

                        duplicated=true;

                        break;

                    }

                }               

                if(error == false && duplicated==false){

                    PartTimeStaffHire ptsh = new PartTimeStaffHire (vacancy_no, designation, jobType, workingHour,wagesPerHour,shifts);

                    list.add(ptsh);

                    JOptionPane.showMessageDialog(frame,"Part Time staff added!");

                }

                else{

                    JOptionPane.showMessageDialog(frame, "Part-Time staff is already hired");

                }

            }

            catch(Exception ex){

            JOptionPane.showMessageDialog(frame, "Invalid Input");

            }

        }

        if(e.getSource()==appointfullbutton){

            int cut = 0;

            try{

                error = false;

                int vacancyNo = Integer.parseInt(fulappoinvac.getText());

                String staffName = fulstafnam.getText();

                String qualification = fulquali.getText();

                year = fcb.getSelectedItem().toString();

                month = cb1.getSelectedItem().toString();

                day = cb2.getSelectedItem().toString();

                String joiningDate = (year+month+day).toString();

                String appointedBy = fulappoinby.getText();

               

                if (fulappoinvac.getText().isEmpty()){

                    error = true;

                    JOptionPane.showMessageDialog(frame,"Empty field found!");

                }

                else if (fulstafnam.getText().isEmpty() || fulquali.getText().isEmpty()||fcb.getSelectedItem().toString().isEmpty()||

                cb1.getSelectedItem().toString().isEmpty()||cb2.getSelectedItem().toString().isEmpty()||fulappoinby.getText().isEmpty()){

                    error = true;

                    JOptionPane.showMessageDialog(frame,"Empty field found!");

                }

                if(vacancyNo!=0){

                    for (int i =0; i<list.size(); i++){

                        if(list.get(i) instanceof FullTimeStaffHire){

                            FullTimeStaffHire fulltime = (FullTimeStaffHire) list.get(i);

                            int vcnNum = fulltime.getVacancy_no();

                            boolean isjoined = fulltime.getJoined();

                            if(vcnNum == vacancyNo){

                                if(!isjoined){

                                    fulltime.FullTimeStaff_Hire(staffName, joiningDate,  qualification, appointedBy);

                                    JOptionPane.showMessageDialog(frame, "Full-Time staff Appointed");

                                    cut +=1;

                                    break;

                                }

                                else{

                                    JOptionPane.showMessageDialog(frame, "The staff is already appointed.");

                                    break;

                                }

                            }

                        }

                        if(cut==0){

                            JOptionPane.showMessageDialog(frame, "Vacancy Number not valid!");

                        }

                    }

                }

            }

            catch(Exception ex){

                JOptionPane.showMessageDialog(frame, "Invalid Input");

            }

        }

        if(e.getSource()==appoipartbut){

            int cut = 0;

            try{

                error = false;

                int vacancyNo = Integer.parseInt(parappoinvac.getText());

                String staffName = parstaffname.getText();

                String qualification = parqualific.getText();

                year = cbp1.getSelectedItem().toString();

                month = cbp2.getSelectedItem().toString();

                day = cbp3.getSelectedItem().toString();

                String joiningDate = (year+month+day).toString();

                String appointedBy = parappoin.getText();

               

                if (parappoinvac.getText().isEmpty()){

                    error = true;

                    JOptionPane.showMessageDialog(frame,"Empty field found!");

                }

                else if (parstaffname.getText().isEmpty() || parqualific.getText().isEmpty()||cbp1.getSelectedItem().toString().isEmpty()||

                cbp2.getSelectedItem().toString().isEmpty()||cbp3.getSelectedItem().toString().isEmpty()||parappoin.getText().isEmpty()){

                    error = true;

                    JOptionPane.showMessageDialog(frame,"Empty field found!");

                }

                if(vacancyNo!=0){

                    for (int i =0; i<list.size(); i++){

                        if(list.get(i) instanceof PartTimeStaffHire){

                            PartTimeStaffHire parttime = (PartTimeStaffHire) list.get(i);

                            int vcnNum = parttime.getVacancy_no();

                            boolean Joined = parttime.getJoined();

                            if(vcnNum == vacancyNo){

                                if(!Joined){

                                    parttime.Hire_PartTimeStaff(staffName, joiningDate, qualification, appointedBy);

                                    JOptionPane.showMessageDialog(frame, "Part-Time staff Appointed");

                                    cut +=1;

                                    break;

                                }

                                else{

                                    JOptionPane.showMessageDialog(frame, "The staff is already appointed");

                                    break;

                                }

                            }

                        }

                        if(cut==0){

                            JOptionPane.showMessageDialog(frame, "Vacancy Number not valid");

                        }

                    }

                }

            }

            catch(Exception ex){

                JOptionPane.showMessageDialog(frame, "Invalid Input");

            }

        }

        if(e.getSource()==terminatebut){

            int cut = 0;

            int Vacancy = 0;

            try{

                Vacancy = Integer.parseInt(vacanTer.getText());

                if(Vacancy!=0){

                    for (int i =0; i<list.size(); i++){

                        if(list.get(i) instanceof PartTimeStaffHire){

                            PartTimeStaffHire parttimes = (PartTimeStaffHire) list.get(i);

                            boolean terminate = parttimes.getTerminated();

                            int vacncy = parttimes.getVacancy_no();

                            if(vacncy == Vacancy){

                                if(!terminate){

                                    parttimes.terminate();

                                    JOptionPane.showMessageDialog(frame,"Staff is terminated.");

                                    cut = cut+1;

                                }

                                else{

                                    JOptionPane.showMessageDialog(frame,"Staff is already terminated.");

                                }

                            }

                            break;

                        } 

                        if(cut==0){

                            JOptionPane.showMessageDialog(frame,"Invalid vacancy number");

                        }

                    }

                }

            }    

            catch(Exception ex){

                JOptionPane.showMessageDialog(frame,"Invalid vacancy number.");

            } 

        }

        if(e.getSource()==disbutton){

            for (int i =0; i<list.size(); i++){

                if(list.get(i) instanceof FullTimeStaffHire){

                    FullTimeStaffHire f = (FullTimeStaffHire) list.get(i);

                    System.out.println("-------- Details of Full-TIme Staff --------");

                    f.Display();

                    System.out.println("");

                }

                else if(list.get(i) instanceof PartTimeStaffHire){

                    PartTimeStaffHire parttime = (PartTimeStaffHire) list.get(i);

                    System.out.println("-------- Details of Part-Time Staff --------");

                    parttime.Display();

                    System.out.println("");

                }

            }

        }

        if(e.getSource()==clearBut){

            fullvacan.setText("");

            fulldesg.setText("");

            cb.setSelectedIndex(0);

            fullsal.setText("");

            fullwor.setText("");

            fulappoinvac.setText("");

            fulstafnam.setText("");

            fulquali.setText("");

            fcb.setSelectedIndex(0);

            cb1.setSelectedIndex(0);

            cb2.setSelectedIndex(0);

            fulappoinby.setText("");

            partvacno.setText("");

            partdesg.setText("");

            cbb.setSelectedIndex(0);

            sbb.setSelectedIndex(0);

            partworhr.setText("");

            partwage.setText(""); 

            parappoinvac.setText("");

            parstaffname.setText("");

            cbp1.setSelectedIndex(0);

            cbp2.setSelectedIndex(0);

            cbp3.setSelectedIndex(0);

            parappoin.setText("");

            vacanTer.setText("");

            JOptionPane.showMessageDialog(frame, "Cleared");      

        }

    }

    public static void main(String[] args){

        MainPortal obj = new MainPortal();

        obj.report();

    }

}