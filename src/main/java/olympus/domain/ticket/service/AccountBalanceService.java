package olympus.domain.ticket.service;

import olympus.domain.advertisement.AccountBalanceInformation;

public interface AccountBalanceService {

	public AccountBalanceInformation generateBalanceOf(Long accountNumber);
}
