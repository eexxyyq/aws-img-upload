package ru.eexxyyq.awsimgupload.profile;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.eexxyyq.awsimgupload.datastore.FakeUserProfileData;

import java.util.List;

@Repository
@AllArgsConstructor
public class UserProfileDataAccessService {
    private final FakeUserProfileData fakeUserProfileData;

    List<UserProfile> getUserProfiles() {
        return fakeUserProfileData.getUserProfiles();
    }
}
