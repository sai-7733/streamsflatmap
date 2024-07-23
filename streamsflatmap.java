import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class A{
    public static void main(String args[]){
        List<Integer> l4=Arrays.asList(1,2,3,4,5);
       List<Integer> l5=l4.stream().map(n->n+5).collect(Collectors.toList());
       System.out.println(l5);
        List<Integer> l1=Arrays.asList(1,2);
        List<Integer> l2=Arrays.asList(3,4);
        List<Integer> l3=Arrays.asList(5,6);
        List<List<Integer>> ffinal=Arrays.asList(l1,l2,l3);
        List<Integer> flist=ffinal.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(flist);
    }
}