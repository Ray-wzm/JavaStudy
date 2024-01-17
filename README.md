**IDEA无法PUSH到github**
报错：
git pull failed: unable to access 'https://github.com/ray-wzm/javastudy.git/': empty reply from server

输入以下命令屏蔽openSSL证书即可：
```java
git config --global http.sslVerify false
or
git config --global --unset http.proxy
```

**方法一经常失效，后续配置SSH使用**
1. SSH密钥
   https://stackoverflow.com/questions/27087483/how-to-resolve-git-pull-fatal-unable-to-access-https-github-com-empty
2. 切换SSH命令
3. SSH官方优化
   https://docs.github.com/en/authentication/troubleshooting-ssh/using-ssh-over-the-https-port

**常用快捷键**
> Ctrl+B 快速定位类
> Ctrl+D 快速删除光标所在行
> Ctrl+Alt+下 快速复制光标所在行
> Ctrl+\ 快速注释
> alt+insert 生成构造器
> ctrl+H 查看类的层级关系
> alt + \ 快速补全代码

