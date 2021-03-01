package chouchou.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class groupsOnClass3 {
    public void teacher1() {
        System.out.println("groupsOnClass3 中的 teacher1 运行");
    }

    public void teacher2() {
        System.out.println("groupsOnClass3 中的 teacher2 运行");
    }
}
