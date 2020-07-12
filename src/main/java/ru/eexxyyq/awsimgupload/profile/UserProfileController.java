package ru.eexxyyq.awsimgupload.profile;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/user-profile")
@CrossOrigin("*")
public class UserProfileController {

    private final UserProfileService userProfileService;

    @GetMapping
    public List<UserProfile> getUserProfileList() {
        return userProfileService.getUserProfiles();
    }

    @PostMapping(
            path = "{userProfileId}/image/upload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void userProfileImageUpload(@PathVariable("userProfileId")UUID userProfileId,
                                  @RequestParam("file") MultipartFile file) {
        userProfileService.userProfileImageUpload(userProfileId, file);
    }

    @GetMapping("{userProfileId}/image/download")
    public byte[] userProfileImageDownload(@PathVariable("userProfileId")UUID userProfileId) {
        return userProfileService.userProfileImageDownload(userProfileId);
    }

}
