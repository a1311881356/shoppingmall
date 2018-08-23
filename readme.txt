1.
spring.datasource.url=jdbc:mysql://localhost:3306/shopingmall
开发阶段每个人都有完整的数据库

2.
dao自己写，但是必须接口，要注意的是dao实现类里面的方法必须在dao里面有

3.
controller类路径问题，每一个controller类上面加@RequestMapping("模块名")，都加swagger

4.
bean之后就不做修改了，没人拷贝一份到自己项目

5.
service接口约定:service实现类里面的方法必须在service里面有，每个模块里面有一份接口

6.
service面向接口

7.包路径的问题：稍后

8.sprinngcloud和springboot理解