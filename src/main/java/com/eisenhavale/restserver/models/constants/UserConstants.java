package com.eisenhavale.restserver.models.constants;

public class UserConstants {
   public static class UserTable {
        static final String TABLE_NAME = "users";

        static class Id{
            static final String COLUMN_NAME = "id";
        }

        static class Name{
            static final String COLUMN_NAME = "name";
        }


        static class LastName{
            static final String COLUMN_NAME = "last_name";
        }

        static class UserName{
            static final String COLUMN_NAME = "user_name";
        }

        static class Birthday{
            static final String COLUMN_NAME = "birthday";
        }

        static class Password {
            static final String COLUMN_NAME = "password";
        }

        static class Email{
            static final String COLUMN_NAME = "email";
        }

        static class IsActive {
            static final String COLUMN_NAME = "status";
        }

        static class ProfileImage{
            static final String COLUMN_NAME = "profile_image";
        }

        static class PhoneNumber {
            static final String COLUMN_NAME = "phone_number";
        }
    }
}
