package in.mayankproj.billingsoftware.service;

import java.util.List;

import in.mayankproj.billingsoftware.io.UserRequest;
import in.mayankproj.billingsoftware.io.UserResponse;

public interface UserService {
    
   UserResponse createUser(UserRequest request);

   String getUserRole(String email);
   List<UserResponse> readUsers();
   void deleteUser(String id);

}
