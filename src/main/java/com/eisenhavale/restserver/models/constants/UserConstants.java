package com.eisenhavale.restserver.models.constants;

public class UserConstants {
   public static class UserTable {
        public static final String TABLE_NAME = "users";
        public static final String ID_COLUMN_NAME = "id";
        public static final String NAME_COLUMN_NAME = "name";
        public static final String LAST_NAME_COLUMN_NAME = "last_name";
        public static final String USER_NAME_COLUMN_NAME = "user_name";
        public static final String BIRTHDAY_COLUMN_NAME = "birthday";
        public static final String PASSWORD_COLUMN_NAME = "password";
        public static final String EMAIL_COLUMN_NAME = "email";
        public static final String STATUS_COLUMN_NAME = "status";
        public static final String IMAGE_COLUMN_NAME = "profile_image";
        public static final String PHONE_COLUMN_NAME = "phone_number";

    }
    public static class UserJoinTable{
         public static final String TABLE_NAME = "user_role";
         public static final String USER_COULMN_NAME = "user_id";
         public static final String ROLE_COULMN_NAME = "role_id";

    }
}
