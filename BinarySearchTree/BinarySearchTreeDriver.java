
public class BinarySearchTreeDriver{
    public static void main(){
        Tree Maintree  = new Tree();
        Maintree.insert(10);
        Maintree.insert(101);
        Maintree.insert(102);
        Maintree.insert(0);
        
        Maintree.print();
        System.out.println();
        
        Maintree.delete(10);
        Maintree.print();
        System.out.println();
        
        
        System.out.println(Maintree.search(10));
        System.out.println(Maintree.search(101));
    }    
}
