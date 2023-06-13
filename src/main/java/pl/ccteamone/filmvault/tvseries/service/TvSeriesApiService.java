package pl.ccteamone.filmvault.tvseries.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.ccteamone.filmvault.tvseries.dto.ApiTvSeriesDto;
import pl.ccteamone.filmvault.tvseries.dto.ApiTvSeriesDtoPage;
import pl.ccteamone.filmvault.tvseries.dto.TvSeriesDto;
import pl.ccteamone.filmvault.tvseries.dto.TvSeriesDtoPage;
import pl.ccteamone.filmvault.tvseries.mapper.TvSeriesMapper;
import pl.ccteamone.filmvault.tvseries.webclient.ApiTvSeriesClient;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TvSeriesApiService {

    private final ApiTvSeriesClient apiTvSeriesClient;
    private final TvSeriesMapper tvSeriesMapper;

    public TvSeriesDto getApiTvSeries(Long tvSeriesId) {
        return tvSeriesMapper.mapToTvSeriesDto(apiTvSeriesClient.getApiTvSeriesByTvSeriesId(tvSeriesId));
    }

    public List<TvSeriesDto> getTvSeriesDiscoverList(Integer page) {
        if (page == null || page == 0) {
            page = 1;
        }
        ApiTvSeriesDtoPage apiTvSeriesPage = apiTvSeriesClient.getTvSeriesDiscoverPage(page);
        return tvSeriesMapper.mapToTvSeriesDtoList(apiTvSeriesPage.getTvSeries());
    }

    public List<TvSeriesDto> getTvSeriesSearchList(Integer page, String phrase) {
        if (page == null || page == 0) {
            page = 1;
        }
        if (phrase == null || phrase.isEmpty()) {
            throw new RuntimeException("No phrase given to initiate search");
        }
        ApiTvSeriesDtoPage apiTvSeriesPage = apiTvSeriesClient.getTvSeriesTitleSearchPage(page, phrase.trim());
        return tvSeriesMapper.mapToTvSeriesDtoList(apiTvSeriesPage.getTvSeries());
    }

    public TvSeriesDtoPage getTvSeriesDiscoverPage(Integer page) {
        return tvSeriesMapper.mapToTvSeriesDtoPage(apiTvSeriesClient.getTvSeriesDiscoverPage(page));
    }
}