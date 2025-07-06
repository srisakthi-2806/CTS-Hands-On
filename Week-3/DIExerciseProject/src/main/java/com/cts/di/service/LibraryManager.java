package com.cts.di.service;

import com.cts.di.datasource.LibraryDataSource;

public class LibraryManager {
    private LibraryDataSource libraryDataSource;

    public void setLibraryDataSource(LibraryDataSource libraryDataSource) {
        this.libraryDataSource = libraryDataSource;
    }

    public void showLibraryInfo() {
        libraryDataSource.fetchData();
    }
}
