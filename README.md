**IDEA无法PUSH到github**
输入以下命令屏蔽openSSL证书即可：
```java
git config --global http.sslVerify false
or
git config --global --unset http.proxy
```
