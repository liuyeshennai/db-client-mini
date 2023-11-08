# db-client-mini
# 应用场景
如果数据库有ip限制，而又想要更多人方便的访问数据，可以利用白名单服务器搭建“跳板”来间接访问数据库。
# 核心思想
主要利用了js可以遍历所有元素属性名称的特性，因此可以动态展示所有字段。
# 使用方法
运行app后，直接访问根目录：<a href="[超链接地址](http://localhost:8080)">http://localhost:8080</a>，即可访问到查询页面。输入Auth认证信息（默认Bearer 123456）以及查询Sql（例如select * from students limit 3）,点击查询即可返回结果：
![image](https://github.com/liuyeshennai/db-client-mini/assets/34265990/d24583b7-ccff-4159-a15d-33f70d0b605a)
# 注意事项
1. 注意补充认证信息，可以使用token，也可以用其他可靠认证方案，保证跳板app不会被恶意攻击。
2. 注意限制查询条数，以免全表扫描给数据库带来不必要的压力。
3. 为了方便调试，应用内置了H2数据库，开箱即用，默认会生成students表及样例数据，可以访问<a href="[超链接地址](http://localhost:8080/h2)">http://localhost:8080/h2</a>进入H2数据库控制台。
