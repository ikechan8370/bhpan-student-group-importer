# Bhpan Student Group Importer
北航网盘从花名册向群组批量导入的小工具

## 用途
将点名册的学生名单导入到北航网盘中创建的个人群组，并赋予只读（包括预览和下载）权限。\
> p.s. 其实是当助教时候懒得一个一个导，于是写的工具
## 用法
### 一：jar包方式
* 依赖Java版本 1.8
* 进入`docker-client`目录，安装北航网盘（Anyshare）依赖：
`cd docker-client && mvn clean install`
* 回到项目根目录，打包为jar包
`mvn clean package`
* 生成的jar包位于target目录下。
* 执行jar包：
`java -jar target/bhpan-connect-0.0.1-SNAPSHOT.jar <args>`
args为参数，执行`java -jar target/bhpan-connect-0.0.1-SNAPSHOT.jar -h`查看参数帮助.
### 二：IDE
适合需要修改源码的同学
* 使用Intellij Idea打开，导入为maven项目。
* 进入`docker-client`目录，安装北航网盘（Anyshare）依赖：\
    `cd docker-client && mvn clean install`
* 编辑IDEA的Run Configuration中的参数运行。
### 三：使用docker（推荐）
懒人推荐，无需本地java环境
* 拉取镜像
`docker pull registry.cn-hangzhou.aliyuncs.com/geyinchi/bhpan-student-group-importer:lates`
* 运行：
`docker run -it registry.cn-hangzhou.aliyuncs.com/geyinchi/bhpan-student-group-importer:latest <args>`
* 如果需要环境变量传入密码：
`docker run -it registry.cn-hangzhou.aliyuncs.com/geyinchi/bhpan-student-group-importer:latest -e BHPAN_PASSWORD=<password> <args>`
基本与用法一相同
## 参数说明

    欢迎使用北航网盘学生花名册导入工具
    usage: bhpan-student-importer
     -f,--file <arg>       花名册文件地址
     -g,--group <arg>      群组id，从网页版北航网盘群组页面url获取，不要带gns://前缀
     -h,--help             获取使用帮助
     -p,--password <arg>   密码，若通过环境变量BHPAN_PASSWORD指定可不显式指定
     -r,--row <arg>        花名册head的行数，默认为6，表示第6行。
     -u,--username <arg>   学号，大写

1. 群组id进入群组页面获取，url形式应该是 `https://bhpan.buaa.edu.cn/#/home/documents/all?gns=E097E5B440904******D996789D39EDE&selections=%5B%5D`， 其中的 `s=E097E5B440904******D996789D39EDE` 就是群组id
2. 花名册文件为excel格式，应该是老师从教务直接导出的。自己写也可以，必须有一列为学号。

![Alt](https://repobeats.axiom.co/api/embed/1972ad43c42387e5d8d17072d56c20e2e651e294.svg "Repobeats analytics image")