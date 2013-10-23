package co.nutrino.api.moves.impl.dto.user;

public class MovesUser {
    private long userId;
    private MovesUserProfile profile;

    public long getUserId() {
	return this.userId;
    }

    public void setUserId(long userId) {
	this.userId = userId;
    }

    public MovesUserProfile getProfile() {
	return this.profile;
    }

    public void setProfile(MovesUserProfile profile) {
	this.profile = profile;
    }
}
