package ru.eexxyyq.awsimgupload.bucket;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BucketName {
    PROFILE_IMAGE("eexxyyq-image-upload");

    private final String bucketName;
}
