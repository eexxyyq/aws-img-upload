package ru.eexxyyq.awsimgupload.datastore;

import org.springframework.stereotype.Repository;
import ru.eexxyyq.awsimgupload.profile.UserProfile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileData {
    private final static List<UserProfile> USER_PROFILES = new ArrayList<>();
    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("0b56f76f-2294-4913-9edf-da69646b4dda"), "janetjohnes", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("01712355-196d-41fa-b595-81715f1fe3bd"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}

