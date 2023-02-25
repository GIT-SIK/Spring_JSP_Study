package dev.scheincomp.jsp.study;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
/* Rest API */
@RestController
@RequestMapping(path ="/study")
public class UserRController {
    @Resource
    private UserRMapper userRMapper;
    @GetMapping("/users")
        public List getAllUser(){
        System.out.println("==================");
        System.out.println("USER : ALL");
        System.out.println("Method : GET");
        System.out.println("==================");
        return userRMapper.getAllUser();
        }

    /* ResponseEntity를 사용하여 상태코드와 넘김*/
    @GetMapping("/users/{nickname}")
        public ResponseEntity findUserByNickname(@PathVariable("nickname") String nickname){
        System.out.println("==================");
        System.out.println("USER : " + nickname);
        System.out.println("Method : GET");
        System.out.println("==================");

        UserRVO user = userRMapper.findUserByNickname(nickname);
        if(user == null) {
            System.out.println("ErrorCode : NOT_FOUND");
            return new ResponseEntity("NOT_FOUND", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(user, HttpStatus.OK);

    }

}
