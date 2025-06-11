package Repository;

import dto.StampedCaseDto;

public interface StampedCaseRepository {
    String persist(StampedCaseDto stampedCaseDto);
}
