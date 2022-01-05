import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.lang.reflect.Array;
public class test01
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner tmp = new Scanner(System.in);
        System.out.println("1. List\n2.ArrayList\nChon: ");
        int chon = tmp.nextInt();
        switch(chon)
        {
            case 1:
            {
                ListTest();
                break;
            }
            case 2:
            {
                ArrayListTest();
                break;
            }
        }          
    }
    public static void ListTest()
    {
        Scanner tmp = new Scanner(System.in);
        Scanner pause = new Scanner(System.in);

        //Tạo 1 đối tượng của List interface
        List<String> list = new ArrayList<>();

        System.out.println("Nhap so luong phan tu: ");
        int n = tmp.nextInt();
        
        //=======================================================
        //Array list in Java
        //Input data into ArrayList
        for(int i = 1; i <= n; i++)
        {
            System.out.println("Nhap pt thu " + i + " : ");
            String str = tmp.next();
            list.add(str);
        }
        int chon;

        do{
            //System.out.println("1. Truy cap vao vi tri\n2. Thay doi phan tu\n3. Xoa phan tu");
            clearConsole();
            menuList();
            System.out.print("\nChon: ");
            chon = tmp.nextInt();
            switch(chon)
            {
                case 1:
                {
                    addElementIntoList(list);             
                    break;
                }
                case 2:
                {
                    removeElementList(list);
                    break;
                }
                case 3:
                {
                    findElementList(list);
                    break;
                }
                case 4:
                {
                    traverseList(list);
                    break;
                }
                case 5:
                {
                    getSizeOfList(list);
                    break;
                }
                case 6:
                {
                    getElementInfolist(list);
                    break;
                }
                case 7:
                {
                    changeElementInfoList(list);
                    break;
                }
                case 8:
                {
                    sortList(list);
                    break;
                }
                case 9:
                {
                    removeAllList(list);
                    break;
                }
                default:
                {
                    System.out.println("EXIT!");
                    break;
                }
            } 
            pause.nextLine();
            //Thread.sleep(2000);       
        }while(chon > 0 && chon <= 10);
    
    }

    public static void ArrayListTest()
    {
        Scanner tmp = new Scanner(System.in);
        Scanner pause = new Scanner(System.in);
        //String name = tmp.nextLine();
        
        System.out.println("Nhap so luong phan tu: ");
        int n = tmp.nextInt();
        
        //Khởi tạo Array list
        ArrayList<String> a = new ArrayList<String>();

        //=======================================================
        //Array list in Java
        //Input data into ArrayList
        for(int i = 1; i <= n; i++)
        {
            System.out.println("Nhap pt thu " + i + " : ");
            String str = tmp.next();
            a.add(str);
        }
        int chon;

        do{
            //System.out.println("1. Truy cap vao vi tri\n2. Thay doi phan tu\n3. Xoa phan tu");
            clearConsole();
            menu();
            System.out.print("\nChon: ");
            chon = tmp.nextInt();
            switch(chon)
            {
                case 1:
                {
                    addElementIntoArrayList(a);             
                    break;
                }
                case 2:
                {
                    removeElementArrayList(a);
                    break;
                }
                case 3:
                {
                    findElementArrayList(a);
                    break;
                }
                case 4:
                {
                    traverseArrayList(a);
                    break;
                }
                case 5:
                {
                    getSizeOfArrayList(a);
                    break;
                }
                case 6:
                {
                    getElementInfoArraylist(a);
                    break;
                }
                case 7:
                {
                    changeElementInfoArrayList(a);
                    break;
                }
                case 8:
                {
                    sortArrayList(a);
                    break;
                }
                case 9:
                {
                    removeAllArrayList(a);
                    break;
                }
                default:
                {
                    System.out.println("EXIT!");
                    break;
                }
            } 
            pause.nextLine();
            //Thread.sleep(2000);       
        }while(chon > 0 && chon <= 10);
    
    }
    public static void menu()
    {
        System.out.println("===============================================\n");
        System.out.println("                    -ArrayList-                  ");
        System.out.println("                1. Them phan tu                ");        
        System.out.println("                2. Xoa phan tu                 ");    
        System.out.println("                3. Tim pham tu                 ");
        System.out.println("                4. Duyet ArrayList             ");
        System.out.println("                5. Kich thuoc ArrayList        ");        
        System.out.println("                6. Truy cap vao vi tri         ");
        System.out.println("                7. Thay doi phan tu            ");
        System.out.println("                8. Sap xep ArrayList           ");
        System.out.println("                9. Xoa het ArrayList           ");
        System.out.println("===============================================");
    }
    public static void menuList()
    {
        System.out.println("===============================================\n");
        System.out.println("                       -List-                  ");
        System.out.println("                1. Them phan tu                ");        
        System.out.println("                2. Xoa phan tu                 ");    
        System.out.println("                3. Tim pham tu                 ");
        System.out.println("                4. Duyet ArrayList             ");
        System.out.println("                5. Kich thuoc ArrayList        ");        
        System.out.println("                6. Truy cap vao vi tri         ");
        System.out.println("                7. Thay doi phan tu            ");
        System.out.println("                8. Sap xep ArrayList           ");
        System.out.println("                9. Xoa het ArrayList           ");
        System.out.println("===============================================");
    }
    public final static void clearConsole()  
    {  
        try  
        {  
        final String os = System.getProperty("os.name");  
            if (os.contains("Windows"))  
            {  
                Runtime.getRuntime().exec("cls");  
            }  
            else  
            {  
                Runtime.getRuntime().exec("clear");  
            }  
        }  
        catch (final Exception e)  
        {  
        e.printStackTrace();  
    }  
    }  

    //====Thêm phần tử====
    //ArrayList
    public static void addElementIntoArrayList(ArrayList<String> list)
    {
        Scanner tmp = new Scanner(System.in);
        System.out.println(list); 
        System.out.print("Nhap vi tri them phan tu: "); 
        int k = tmp.nextInt(); 
        System.out.print("Nhap gia tri: "); 
        String str = tmp.next(); 
        list.add(k,str);
        System.out.println(list);     
    }
    //List
    public static void addElementIntoList(List<String> list)
    {
        Scanner tmp = new Scanner(System.in);
        System.out.println(list); 
        System.out.print("Nhap vi tri them phan tu: "); 
        int k = tmp.nextInt(); 
        System.out.print("Nhap gia tri: "); 
        String str = tmp.next(); 
        list.add(k,str);
        System.out.println(list);     
    }
    //====Lấy thông tin phần tử====
    //ArrayList
    public static void getElementInfoArraylist(ArrayList<String> list)
    {
         Scanner tmp = new Scanner(System.in);
         System.out.println(list);
         int n;
         //Access an item
         do{
            System.out.println("Nhap vi tri: ");
            n = tmp.nextInt();
         }while(n < 0 && n >= list.size());
         System.out.println("\nPhan tu nam o vi tri " + n + " la: "+ list.get(n));
    }
    //List
    public static void getElementInfolist(List<String> list)
    {
         Scanner tmp = new Scanner(System.in);
         System.out.println(list);
         int n;
         //Access an item
         do{
            System.out.println("Nhap vi tri: ");
            n = tmp.nextInt();
         }while(n < 0 && n >= list.size());
         
         System.out.println("\nPhan tu nam o vi tri " + n + " la: "+ list.get(n));
    }
    //====Lấy thông tin phần tử====
    //ArrayList
    public static void changeElementInfoArrayList(ArrayList<String> list)
    {
        Scanner tmp = new Scanner(System.in);
        //Change an item
        System.out.println(list); 
        System.out.print("Nhap vi tri can thay doi: "); 
        int n = tmp.nextInt(); 
        System.out.print("Nhap gia tri: "); 
        String str = tmp.next(); 
        list.set(n, str); 
        System.out.println(list); 
    }
    //List
    public static void changeElementInfoList(List<String> list)
    {
        Scanner tmp = new Scanner(System.in);
        //Change an item
        System.out.println(list); 
        System.out.print("Nhap vi tri can thay doi: "); 
        int n = tmp.nextInt(); 
        System.out.print("Nhap gia tri: "); 
        String str = tmp.next(); 
        list.set(n, str); 
        System.out.println(list); 
        
    }
    //====Xóa phần tử====
    //ArrayList
    public static void removeElementArrayList(ArrayList<String> list)
    {
        Scanner tmp = new Scanner(System.in);
        //Remove an item
        System.out.println(list);
        System.out.print("Nhap vi tri can xoa: ");
        int n = tmp.nextInt();
        if(n > list.size() || n < 0)
        {
            System.out.println("Vi tri "+ n + " khong ton tai!");
        }
        else
        {
            list.remove(n);
            
        }                 
        System.out.println(list);
    }
    //List
    public static void removeElementList(List<String> list)
    {
        Scanner tmp = new Scanner(System.in);
        //Remove an item
        System.out.println(list);
        System.out.print("Nhap vi tri can xoa: ");
        int n = tmp.nextInt();
        if(n > list.size() || n < 0)
        {
            System.out.println("Vi tri "+ n + " khong ton tai!");
        }
        else
        {
            list.remove(n);
            
        }                 
        System.out.println(list);
    }
    //====Xóa toàn bộ phần tử====
    //ArrayList
    public static void removeAllArrayList(ArrayList<String> list)
    {
        //Remove all
        System.out.println(list);
        System.out.print("Xoa toan bo ArrayList...");
        list.clear();
        System.out.println(list);
    }
    //List
    public static void removeAllList(List<String> list)
    {
        //Remove all
        System.out.println(list);
        System.out.print("Xoa toan bo ArrayList...");
        list.clear();
        System.out.println(list);
    }
    //====Lấy kích thước====
    //ArrayList
    public static void getSizeOfArrayList(ArrayList<String> list)
    {
        //Check Size
        System.out.println(list);
        System.out.println("Kich thuoc cua ArrayList hien tai: "+ list.size());
    }
    //List
    public static void getSizeOfList(List<String> list)
    {
        //Check Size
        System.out.println(list);
        System.out.println("Kich thuoc cua ArrayList hien tai: "+ list.size());
    }
    //====Tìm phần tử====
    //ArrayList
    public static void findElementArrayList(ArrayList<String> list)
    {
        Scanner tmp = new Scanner(System.in);
        System.out.println(list);
        System.out.print("Nhap gia tri: "); 
        String str = tmp.next(); 
        System.out.print("Phan tu " + str + " co ton tai trong ArrayList hay khong: "); 
        System.out.print(list.indexOf(str));

        System.out.println();

        System.out.print("Vi tri xuat hien dau tien cua " + str + ": "); 
        System.out.print(list.indexOf(str));

        System.out.println();

        System.out.print("Vi tri xuat hien cuoi cung cua " + str + ": "); 
        System.out.print(list.lastIndexOf(str));
    }
    //List
    public static void findElementList(List<String> list)
    {
        Scanner tmp = new Scanner(System.in);
        System.out.println(list);
        System.out.print("Nhap gia tri: "); 
        String str = tmp.next(); 
        System.out.print("Phan tu " + str + " co ton tai trong ArrayList hay khong: "); 
        System.out.print(list.indexOf(str));

        System.out.println();

        System.out.print("Vi tri xuat hien dau tien cua " + str + ": "); 
        System.out.print(list.indexOf(str));

        System.out.println();

        System.out.print("Vi tri xuat hien cuoi cung cua " + str + ": "); 
        System.out.print(list.lastIndexOf(str));
    }
    //====Duyệt phần tử====
    //ArrayList
    public static void traverseArrayList(ArrayList<String> list)
    {
        ListIterator<String> iterator = list.listIterator();
        System.out.println("Cac phan tu co trong list la: ");
        while (iterator.hasNext())
        {
            System.out.println((String) iterator.next());
        }
    }
    //List
    public static void traverseList(List<String> list)
    {
        ListIterator<String> iterator = list.listIterator();
        System.out.println("Cac phan tu co trong list la: ");
        while (iterator.hasNext())
        {
            System.out.println((String) iterator.next());
        }
    }
    //====Sắp xếp====
    //ArrayList
    public static void sortArrayList(ArrayList<String> list)
    {
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    //List
    public static void sortList(List<String> list)
    {
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

}