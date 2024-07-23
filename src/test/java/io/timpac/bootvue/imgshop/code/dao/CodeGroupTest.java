package io.timpac.bootvue.imgshop.code.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class CodeGroupTest {
    @Autowired
    private CodeGroupJpaRepository codeGroupJpaRepository;
    @Autowired
    private CodeDetailJpaRepository codeDetailJpaRepository;

    @Test
    public void insertCodeGroupWithCodeDetail() {
        CodeGroup codeGroup = new CodeGroup();
        codeGroup.setGroupCode("A01");
        codeGroup.setGroupName("job");
        codeGroupJpaRepository.save(codeGroup);

        CodeDetail codeDetail1 = new CodeDetail("developer", "00");
        codeDetail1.setCodeGroup(codeGroup);
        codeDetailJpaRepository.save(codeDetail1);

        CodeDetail codeDetail2 = new CodeDetail("designer", "01");
        codeDetail2.setCodeGroup(codeGroup);
        codeDetailJpaRepository.save(codeDetail2);

        int removeCnt = codeGroupJpaRepository.deleteWithCodeDetail(codeGroup.getGroupCode());
        assertEquals(2, removeCnt);
    }

    @Test
    public void cascadeTest() {
        CodeGroup codeGroup = new CodeGroup();
        codeGroup.setGroupCode("A01");
        codeGroup.setGroupName("job");
        codeGroup.addCodeDetail(new CodeDetail("developer", "00"));
        codeGroup.addCodeDetail(new CodeDetail("designer", "01"));

        codeGroupJpaRepository.save(codeGroup);
        assertEquals(1, codeGroupJpaRepository.count());
        assertEquals(2, codeDetailJpaRepository.count());

        codeGroupJpaRepository.deleteById(codeGroup.getGroupCode());
        assertEquals(0, codeDetailJpaRepository.count());
    }

}