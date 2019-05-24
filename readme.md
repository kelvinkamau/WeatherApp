# WeatherApp

## This app uses the MVVM Architecture.

### All the following Android Architecture Components were used:

* Lifecycles: It manages activity and fragment lifecycles of our app, survives configuration changes, avoids memory leaks and easily loads data into our UI.
* LiveData: It notifies views of any database changes. Use LiveData to build data objects that notify views when the underlying database changes.
* Navigation: It handles everything needed for in-app navigation in Android application.
* Room: It is a SQLite object mapping library. Use it to Avoid boilerplate code and easily convert SQLite table data to Kotlin objects. Room provides compile time checks of SQLite statements and can return RxJava, Flowable and LiveData observables.
* ViewModel: It manages UI-related data in a lifecycle-conscious way. It stores UI-related data that isn't destroyed on app rotations.

###Future improvements on architecture:

* DataBinding was buggy so I opted to do without it. However, future updates will include DataBinding.
* WorkManager will also be implemented to update the weather in the background at a specific refresh rate.
* Paging will be implemented when loading information on demand from our data source in the future forecast.

## Major implementations based on Google I/O 2019
* Dark theme
* Navigation
* More Kotlin coroutines 1.3
* More material design components & customizations
