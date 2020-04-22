//【注】速度：StringBuilder>StringBuffer>String
//方案一：replaceAll投机取巧
class Solution {
    public String replaceSpace(String s) {
        String string = s.replaceAll(" ", "%20");
        return string;
    }
}

//方案二：StringBuffer
class Solution {
    public String replaceSpace(String s) {
       
        StringBuffer buffer = new StringBuffer(s);
        int index = -1;
        while((index=buffer.indexOf(" "))!=-1){
            buffer.deleteCharAt(index).insert(index,"%20");
        }
        return buffer.toString();
    }
}

//方案三：StringBuilder(线程不安全)
//除了将StringBuffer改成StringBuilder，没什么不一样
class Solution {
    public String replaceSpace(String s) {

        StringBuilder builder = new StringBuilder(s);
        int index = -1;
        while((index=builder.indexOf(" "))!=-1){
            builder.deleteCharAt(index).insert(index,"%20");
        }
        return builder.toString();
    }
}

