package io.timpac.bootvue.imgshop.code.dao;

import io.timpac.bootvue.imgshop.common.entity.DateEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class CodeDetail {
    public CodeDetail(String codeName, String codeValue) {
        this.codeName = codeName;
        this.codeValue = codeValue;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeDetailNo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GROUP_CODE")
    private CodeGroup codeGroup;
    private String codeValue;
    private String codeName;
    private Boolean useYn;
    @Embedded
    private DateEntity dateEntity;

    public void setCodeGroup(CodeGroup codeGroup) {
        if(this.codeGroup != null) {
            this.codeGroup.getCodeDetails().remove(this);
        }
        this.codeGroup = codeGroup;
        this.codeGroup.getCodeDetails().add(this);
    }
}
