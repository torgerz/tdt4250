# tdt4250
Advanced Software Design

# Directory

```
|-- META-INF
|   `-- MANIFEST.MF
|-- model | models 
|   |-- StudyPlan.xmi
|   |-- stpl.ecore
|   `-- stpl.genmodel
|-- src
|   `-- tdt4250
|       `-- stpl
|           |-- example   *test file for merging course code and name*
|           |   `-- FullCourseTitle.java
|           |-- impl *implementation classes*
|           |   |-- CourseImpl.java
|           |   |-- SemesterImpl.java
|           |   |-- SpecializationImpl.java
|           |   |-- StartOfStudyImpl.java
|           |   |-- StplFactoryImpl.java
|           |   |-- StplPackageImpl.java
|           |   `-- StudyPlanImpl.java
|           |-- util  *contains manully written validation*
|           |   |-- StplAdapterFactory.java
|           |   |-- StplSwitch.java
|           |   `-- StplValidator.java
|           |-- Course.java
|           |-- Credit.java
|           |-- Semester.java
|           |-- Specialization.java
|           |-- StartOfStudy.java
|           |-- StplFactory.java
|           |-- StplPackage.java
|           `-- StudyPlan.java
|-- build.properties
|-- plugin.properties
`-- plugin.xml
```

## Classes
### StudyPlan
The top of the model.
### Specialization
The study program with possibility for adding subspecialization (direction).
### StartOfStudy
Setting the year of first semester.
### Semester
Semester gives a list of mandatory and elective courses for the given semesters.
### Course
Course code, name and credits for the different courses.
## Opposites
* Semester <-> StartOfStudy.
* StartOfStudy <-> Specialization
## Derived Features
### Course code + course name
Used derived features to put course code and name together as one string.
## Constraints
Implemented OCL constraint for checking that each study plan contains a minimum of four semesters. Also manually written code for checking that a semester contains a course.
