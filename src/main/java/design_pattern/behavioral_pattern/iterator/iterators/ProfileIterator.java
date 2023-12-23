package design_pattern.behavioral_pattern.iterator.iterators;

import design_pattern.behavioral_pattern.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}