package week13.iterator.ex2;

import java.util.List;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String profileId;
    private String type;
    private int currentPosition = 0;
    private Profile[] cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit() {
        if (cache == null) {
            List<String> profiles = facebook.socialGraphRequest(this.profileId, this.type);
            cache = new Profile[profiles.size()];
            int i = 0;
            for (String profile : profiles) {
                cache[i++] = facebook.requestProfileFromFacebook(profile);
            }
        }

    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.length;
    }

    @Override
    public Profile getNext() {
        if (!hasMore()) {
            return null;
        }
        Profile friendProfile = cache[currentPosition];
        currentPosition++;
        return friendProfile;
    }

}
