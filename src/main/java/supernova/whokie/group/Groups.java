package supernova.whokie.group;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import supernova.whokie.global.entity.BaseTimeEntity;

@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
public class Groups extends BaseTimeEntity {

    @Id
    private Long id;

    private String groupName;
    private String description;
    private String groupImageUrl;
}
