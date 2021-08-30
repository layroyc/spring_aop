package spring22aop02;

import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountSerciceImpl implements AccountService {
    @Override
    public void findAll() {
        int i=1/0;
        System.out.println("全查");
    }
}
