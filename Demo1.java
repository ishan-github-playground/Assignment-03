import java.util.Scanner;

public class Demo1{
    public static void main(String[] args) {
        String studentName="Thari";
        int studentAge=10;

        String subName1="SE-1";
        String subName2="SE-2";
        String subName3="SE-3";

        double subMarks1=56;
        double subMarks2=66;
        double subMarks3=76;
        double avg;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your Name :");
        String name=scanner.nextLine().strip();
        if(name.length()==0 || name.isEmpty()) System.out.println("\u001B[31mInvalid Name");
        
        else {
            studentName=name;
            System.out.print("Enter your Age: ");
            String age1=scanner.nextLine();
            int age=Integer.parseInt(age1);
            
            if(age<10||age>18) System.out.println("\u001B[31mInvalid Age");
            else{
                studentAge=age;
                System.out.print("Enter your subject 1: ");
                String sub1=scanner.nextLine();
                if(!sub1.startsWith("SE-")) System.out.println("\u001B[31mInvalid Subject 1");
                else{
                    subName1=sub1;
                    System.out.printf("Enter your marks 1: ");
                    String subM1x=scanner.nextLine();
                    double subM1=Double.parseDouble(subM1x);
                    if(subM1<0||subM1>100) System.out.println("\u001B[31mInvalid Marks 1");
                    else{
                        subMarks1=subM1;
                        System.out.print("Enter your subject 2: ");
                        String sub2=scanner.nextLine();
                        if(!sub2.startsWith("SE-")||sub2.equals(sub1)) System.out.println("\u001B[31mInvalid Subject 2");
                        else{
                            subName2=sub2;
                            System.out.printf("Enter your marks 2: ");
                            String subM2x=scanner.nextLine();
                            double subM2=Double.parseDouble(subM2x);
                            if(subM2<0||subM2>100) System.out.println("\u001B[31mInvalid Marks 2");
                            else{
                                subMarks2=subM2;
                                System.out.print("Enter your subject 3: ");
                                String sub3=scanner.nextLine();
                                if(!sub3.startsWith("SE-")||sub3.equals(sub1)||sub3.equals(sub2)) System.out.println("\u001B[31mInvalid Subject 3");
                                else{
                                    subName3=sub3;
                                    System.out.printf("Enter your marks 3: ");
                                    String subM3x=scanner.nextLine();
                                    double subM3=Double.parseDouble(subM3x);
                                    if(subM3<0||subM3>100) System.out.println("\u001B[31mInvalid Marks 3");
                                    else subMarks3=subM3;
           
           
                                    }
                                }

                            }
                        }

                    }

                }
            }
        System.out.println(studentName+" "+studentAge+" "+subName1+" "+subName2+" "+subName3+" "+subMarks1+" "+subMarks2+" "+subMarks3);
        avg=(subMarks1+subMarks2+subMarks3)/3;
        int s1=Integer.parseInt(subName1.substring(3));
        int s2=Integer.parseInt(subName2.substring(3));
        int s3=Integer.parseInt(subName3.substring(3));


        String status;
        if(avg>=75) status="\u001B[34mDistinguished Pass\u001B[0m";
        else if(avg<75&&avg>=65) status="\u001B[32mCredit Pass\u001B[0m";
        else if(avg<65&&avg>=55) status="\u001B[33mPass\u001B[0m";
        else status="\u001B[31mFail\u001B[0m";

        String status1;
        if(subMarks1>=75) status1="\u001B[34mDistinguished Pass\u001B[0m";
        else if(subMarks1<75&&subMarks1>=65) status1="\u001B[32mCredit Pass\u001B[0m";
        else if(subMarks1<65&&subMarks1>=55) status1="\u001B[33mPass\u001B[0m";
        else status1="\u001B[31mFail\u001B[0m";

        String status2;
        if(subMarks2>=75) status2="\u001B[34mDistinguished Pass\u001B[0m";
        else if(subMarks2<75&&subMarks2>=65) status2="\u001B[32mCredit Pass\u001B[0m";
        else if(subMarks2<65&&subMarks2>=55) status2="\u001B[33mPass\u001B[0m";
        else status2="\u001B[31mFail\u001B[0m";

        String status3;
        if(subMarks3>=75) status3="\u001B[34mDistinguished Pass\u001B[0m";
        else if(subMarks3<75&&subMarks3>=65) status3="\u001B[32mCredit Pass\u001B[0m";
        else if(subMarks3<65&&subMarks3>=55) status3="\u001B[33mPass\u001B[0m";
        else status3="\u001B[31mFail\u001B[0m";

        System.out.println("+--------------------------------------------+");
        System.out.printf("|%3sName  : \u001B[34m\u001B[1m%-33s\u001B[0m|\n"," ",studentName.toUpperCase());
        System.out.printf("|%4sAge  : %2s Years old%21s|\n"," ",studentAge," ");
        System.out.printf("|%sStatus  : %-19s%22s|\n"," ",status," ");
        System.out.printf("|%2sTotal  : %-5.2f%28s|\n"," ",avg," ");
        System.out.println("+--------------------------------------------+");
        System.out.println("|   Subject  |   Marks   |  Status           |");
        System.out.println("+--------------------------------------------+");
        System.out.printf("|   SE-%03d   |  %5s    | %-27s|\n",s1,subMarks1,status1);
        System.out.println("+--------------------------------------------+");
        System.out.printf("|   SE-%03d   |  %5s    | %-27s|\n",s2,subMarks2,status2);
        System.out.println("+--------------------------------------------+");
        System.out.printf("|   SE-%03d   |  %5s    | %-27s|\n",s3,subMarks3,status3);
        System.out.println("+--------------------------------------------+");


        }   
    }