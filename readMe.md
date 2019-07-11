### 修改maven的pom文件配置(解决idea下，maven项目中src源代码里的xml等资源文件无法编译进classes文件夹的问题):

　　在idea的maven项目中，默认源代码目录下的xml等资源文件并不会在编译的时候一起打包进classes文件夹，而是直接舍弃掉。如果使用的是eclipse，eclipse的src目录下的xml等资源文件在编译的时候会自动打包进输出到classes文件夹。hibernate、mybatis和spring有时会将配置文件放置在src目录下，编译后要一起打包进classes文件夹，所以存在着需要将xml等资源文件放置在源代码目录下的需求。

　　解决方式:在pom文件中找到<build>节点，添加下列代码:

    <resources>
      <resource>
        <directory>src/main/java</directory>
        <includes>
          <include>**/*.xml</include>
        </includes>
      </resource>
    </resources>