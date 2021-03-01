package chouchou.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class groupsOnClass2 {
    public void stu1() {
        System.out.println("groupsOnClass2 中的 stu1 运行");
    }
    public void stu2() {
        System.out.println("groupsOnClass2 中的 stu2 运行");
    }
}
