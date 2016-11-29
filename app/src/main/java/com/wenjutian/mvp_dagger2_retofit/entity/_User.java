package com.wenjutian.mvp_dagger2_retofit.entity;



/**
 * Created by baixiaokang on 16/4/29.
 */
public class _User  {

    /**
     * Username : Dandan.Cao
     * Password : 12345Delta
     */

    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public static class LoginResult {

        @Override
        public String toString() {
            return "LoginResult{" +
                    "LogoutInfo='" + LogoutInfo + '\'' +
                    ", LoginInfo='" + LoginInfo + '\'' +
                    ", sessionInfo='" + sessionInfo + '\'' +
                    ", LtpaToken='" + LtpaToken + '\'' +
                    ", LtpaToken2='" + LtpaToken2 + '\'' +
                    '}';
        }

        /**
         * LogoutInfo :
         * LoginInfo :
         * sessionInfo : {"status":true,"sessionTimeout":false,"title":"Success","msg":"login success","type":null,"jsonData":{"rtnPath":"index.html"}}
         * LtpaToken : aCx2lbDOvTuRGp2al9OS2Gl7yEY5RbJV3bq7fB3lsQjXw6/kcdCOo/RZAaHI/COnADcRCdiQpIQmhsNtuL7/GG+j0vYuhk1xwbENHoYrNOgjZQcML3NHk2ms6gxFUhH93xZYIfiPZW18EF8onVzw1hudrXUwtb8CFU84gxvND4djPeX351+94QOyJB4qXTPN+YZuFey/QeSJrEP2iqqmjaGd5hQxP9rBJvKL2kNIqGfNBUYdZcvkajzhyE1peF11pXxhEKFl0dYWy9sQlDGwO106JF9v8A7OXPE/VrmE5uTDsly4fiWGQNzXUlWJWdkC7mtf9bWG4AbGqmIwCFzzFSsIitHEhkKcWXCxd2M7IinixGUNd9XMnGjSRwDdQEnYGJSZFD2fiTzYpq5zvpb4Ig==
         * LtpaToken2 : OIiilW4pWgJf8VotTAauvPYerXb1dCCJtSo9F5ez13C5gM7GbyVcCa2ZQJZGi+ycWvaurUifJujxwTwcVj79KanXi5rA6X+jaCFjy7ZAYNjw6zMeOVy4ob110R+252UQ8oN+qL2aHpgvI1qNCzzBbOu3gEQFeZnes4hRkkcfVbDE3BzLF/CdS7rRAaapXoeKB6UXWuWjZf8Jfc3M7NvEvCrpJzYJGz4yvVOxHK92gc2T/NrS+FPdqfT3R2Dhj3ZIYJtSNtH/+WEwZQYfZv11V8X3/7LkkXjNejkZkF4xSvU+OcjbryIP6QNmMsEmWtBzatSYMIim2wds/OVxYhMWWNo8C4W5hC7136drL2cOhTytisQ1TTB+slXrpjfrwpQ4BOwOaltek53eXpeQdJCyq3+9EbVe/eeXW3bqZEd02fCRQ0bIYsQTwVVtmIzC/phukxZNj8oFuuEw/bggDtswQedhMfxGwY+4YqSSTO7vwUKMusRVSvNI8sQdONMAT99nE5dLme6pmrQ7tOaoIKSeQ2WbKf2rGLQmKVHcwIkCfZXycjRvXcP4RVyOMIZSqfeAYW1n1t0H5qPycbIA9N2vLi5SJXw1OjYnpjASfNqvCp2T/cCOOAB/w5A+7nOykJ1+JM3/KaO+P/Wz/n094YcKylDelviIUXmMWEV4gPLeQYanQAz3nxI0Jl3cjHNyrFyoWkcvFTiTDZCA/Bz2WoQ8uBx1/AzkdKL5OOuAM9JbEc1kq+9JEu/53KlDjDSLYgjW
         */

        private String LogoutInfo;
        private String LoginInfo;
        private String sessionInfo;
        private String LtpaToken;
        private String LtpaToken2;

        public String getLogoutInfo() {
            return LogoutInfo;
        }

        public void setLogoutInfo(String LogoutInfo) {
            this.LogoutInfo = LogoutInfo;
        }

        public String getLoginInfo() {
            return LoginInfo;
        }

        public void setLoginInfo(String LoginInfo) {
            this.LoginInfo = LoginInfo;
        }

        public String getSessionInfo() {
            return sessionInfo;
        }

        public void setSessionInfo(String sessionInfo) {
            this.sessionInfo = sessionInfo;
        }

        public String getLtpaToken() {
            return LtpaToken;
        }

        public void setLtpaToken(String LtpaToken) {
            this.LtpaToken = LtpaToken;
        }

        public String getLtpaToken2() {
            return LtpaToken2;
        }

        public void setLtpaToken2(String LtpaToken2) {
            this.LtpaToken2 = LtpaToken2;
        }
    }

}
