package ra.run;

import ra.entity.Student;
import ra.entity.StudentClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    static List<StudentClass> listClass = new ArrayList<>();
    static List<Student> listStudent = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("********************QUAN LY HOC VIEN*********************");
            System.out.println("1. Quan ly lop hoc");
            System.out.println("2. Quan ly sinh vien");
            System.out.println("3. Thoat");
            System.out.print("Su lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    StudentManagement.getClassManagement(sc);
                    break;
                case 2:
                    StudentManagement.getStudentManagement(sc);
                case 3:
                    sc.close();
                    System.exit(0);
                default:
                    System.err.println("Vui long chon tu 1-3");
            }
        } while (true);
    }

    public static void getClassManagement(Scanner sc) {
        boolean classExit = true;
        do {
            System.out.println("*****************QUAN LY LOP HOC****************");
            System.out.println("1. Them moi lop hoc");
            System.out.println("2. Cap nhat thong tin lop hoc");
            System.out.println("3. Hien thi thong tin lop hoc");
            System.out.println("4. Thong ke cac lop hoc dang hoat dong");
            System.out.println("5. Tim kiem lop hoc theo ten lop hoc");
            System.out.println("6. Thoat");
            System.out.print("Su lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    classExit = false;
                    break;
                default:
                    System.err.println("Vui long chon tu 1-6");
            }
        } while (classExit);
    }

    public static void getStudentManagement(Scanner sc) {
        boolean studentExit = true;
        do {
            System.out.println("*****************QUAN LY SINH VIEN****************");
            System.out.println("1. Them moi sinh vien");
            System.out.println("2. Cap nhat thong tin sinh vien");
            System.out.println("3. Hien thi thong tin sinh vien");
            System.out.println("4. Tinh diem trung binh");
            System.out.println("5. Xep loai sinh vien");
            System.out.println("6. Sap xep sinh vien theo diem trung binh tang dan");
            System.out.println("7. Tim kiem sinh vien theo ten sinh vien:");
            System.out.println("8. Thong ke sinh vien dat gioi, kha, trung binh, yeu");
            System.out.println("9. Thong ke cac sinh vien pass qua cac mon hoc");
            System.out.println("10. Thoat");
            System.out.print("Su lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    studentExit = false;
                    break;
                default:
                    System.err.println("Vui long chon tu 1-6");
            }
        } while (studentExit);
    }

    public void inputListStudent(Scanner sc) {
        System.out.println("Nhap vao so sinh vien can nhap thong tin: ");
        int cnt = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < cnt; i++) {
            //Nhap thong tin 1 sinh vien
            Student studentNew = new Student();
            studentNew.inputData(sc);
            //-Nhap thong tin lop sinh vien
            System.out.println("Chon lop hoc cho sinh vien:");
            int index = 1;
            for (StudentClass stClass : listClass) {
                System.out.printf("%d.%s\n",index,stClass.getClassName());
                index++;
            }
            System.out.print("Su lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            //-gan vao cho thuoc tinh studentClass cua doi tuong studentNew
            studentNew.setStudentClass(listClass.get(choice-1));
            //add vao listStudent
            listStudent.add(studentNew);
        }
    }
}
