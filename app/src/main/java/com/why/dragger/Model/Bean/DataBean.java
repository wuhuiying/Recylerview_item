package com.why.dragger.Model.Bean;

import java.util.List;

/**
 * Created by 小慧莹 on 2018/4/9.
 */

public class DataBean {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"newslist":[{"title":"荷塘边的少女（二）","picUrl":"http://image.hnol.net/c/2016-01/16/10/201601161056118966-5058976.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6976844-0-1.html"},{"title":"【美D共享】◆ 氧气美女","picUrl":"http://image.hnol.net/c/2016-01/15/18/201601151858296171-2089977.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6976158-0-1.html"},{"title":"制服诱惑李雪婷Anna苏梅岛性感黑丝女警","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/01/m.xxxiao.com_561dc738bb33f778d2617517ac925ae8-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/27197"},{"title":"丰乳翘臀李雪婷Anna苏梅岛性感比基尼","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/01/m.xxxiao.com_dba90f35efc4045acee4719de6c4bc14-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/27136"},{"title":"前凸后翘李雪婷Anna苏梅岛性感旅拍","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/01/m.xxxiao.com_c049588c5b7a8e554915d35b2330557e-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/27065"},{"title":"性感少妇陈思琪Art火辣丝袜私拍","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/12/m.xxxiao.com_81b0ac55c239af8741616c4ed8990194-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/7737"},{"title":"完美女神SISY思薄荷岛诱人美拍","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/01/m.xxxiao.com_1703f705472d997c0f17faf5c45964b1-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/27011"},{"title":"泳装SISY思薄荷岛性感写真","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/01/m.xxxiao.com_6a9c29072c8ae658bf894d8171ed3bf5-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/26949"},{"title":"巨乳尤物张栩菲勾魂女仆魅惑","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/01/m.xxxiao.com_d9d952d301de0491c4f3b9c5aba5f9a0-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/26926"},{"title":"高挑美女SISY思普吉岛美艳写真","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/01/m.xxxiao.com_6b4d958d47fad53b24357a838858757a-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/26864"}],"code":200,"msg":"success"}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * newslist : [{"title":"荷塘边的少女（二）","picUrl":"http://image.hnol.net/c/2016-01/16/10/201601161056118966-5058976.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6976844-0-1.html"},{"title":"【美D共享】◆ 氧气美女","picUrl":"http://image.hnol.net/c/2016-01/15/18/201601151858296171-2089977.jpg","description":"华声美女","ctime":"2016-03-06 14:11","url":"http://bbs.voc.com.cn/mm/meinv-6976158-0-1.html"},{"title":"制服诱惑李雪婷Anna苏梅岛性感黑丝女警","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/01/m.xxxiao.com_561dc738bb33f778d2617517ac925ae8-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/27197"},{"title":"丰乳翘臀李雪婷Anna苏梅岛性感比基尼","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/01/m.xxxiao.com_dba90f35efc4045acee4719de6c4bc14-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/27136"},{"title":"前凸后翘李雪婷Anna苏梅岛性感旅拍","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/01/m.xxxiao.com_c049588c5b7a8e554915d35b2330557e-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/27065"},{"title":"性感少妇陈思琪Art火辣丝袜私拍","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2015/12/m.xxxiao.com_81b0ac55c239af8741616c4ed8990194-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/7737"},{"title":"完美女神SISY思薄荷岛诱人美拍","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/01/m.xxxiao.com_1703f705472d997c0f17faf5c45964b1-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/27011"},{"title":"泳装SISY思薄荷岛性感写真","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/01/m.xxxiao.com_6a9c29072c8ae658bf894d8171ed3bf5-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/26949"},{"title":"巨乳尤物张栩菲勾魂女仆魅惑","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/01/m.xxxiao.com_d9d952d301de0491c4f3b9c5aba5f9a0-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/26926"},{"title":"高挑美女SISY思普吉岛美艳写真","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/01/m.xxxiao.com_6b4d958d47fad53b24357a838858757a-760x500.jpg","description":"美女图片","ctime":"2016-03-06 14:11","url":"http://m.xxxiao.com/26864"}]
         * code : 200
         * msg : success
         */

        private int code;
        private String msg;
        private List<NewslistBean> newslist;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public List<NewslistBean> getNewslist() {
            return newslist;
        }

        public void setNewslist(List<NewslistBean> newslist) {
            this.newslist = newslist;
        }

        public static class NewslistBean {
            /**
             * title : 荷塘边的少女（二）
             * picUrl : http://image.hnol.net/c/2016-01/16/10/201601161056118966-5058976.jpg
             * description : 华声美女
             * ctime : 2016-03-06 14:11
             * url : http://bbs.voc.com.cn/mm/meinv-6976844-0-1.html
             */

            private String title;
            private String picUrl;
            private String description;
            private String ctime;
            private String url;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPicUrl() {
                return picUrl;
            }

            public void setPicUrl(String picUrl) {
                this.picUrl = picUrl;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getCtime() {
                return ctime;
            }

            public void setCtime(String ctime) {
                this.ctime = ctime;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
