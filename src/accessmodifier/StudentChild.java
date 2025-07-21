package accessmodifier;

public class StudentChild extends  Student{
    void doSomething(){
        name = "Amri";
        // age = 20; -> private so won't work
         batch = "dec10";
         phone = 102930440;
    }
}
