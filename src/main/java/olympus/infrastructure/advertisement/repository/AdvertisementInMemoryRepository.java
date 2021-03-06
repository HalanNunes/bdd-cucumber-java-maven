package olympus.infrastructure.advertisement.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import olympus.domain.advertisement.Advertisement;

@Component
@Qualifier("inMemory")
public class AdvertisementInMemoryRepository  {

	private Map<Long, Advertisement> advertisements;

	public Advertisement getOne(Long userId) {
		return advertisements.get(userId);
	}

	public Advertisement saveAndFlush(Advertisement advertisement) {
		if (advertisements == null) {
			advertisements = new HashMap<>();
		}

		advertisements.put(advertisement.getAdvertisementId(), advertisement);
		
		return advertisement;
	}

}
