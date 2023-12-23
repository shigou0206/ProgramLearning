package design_pattern.behavioral_pattern.iterator.social_networks;

import design_pattern.behavioral_pattern.iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}