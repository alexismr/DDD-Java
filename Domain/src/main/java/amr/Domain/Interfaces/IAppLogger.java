package amr.Domain.Interfaces;

public interface IAppLogger<T>
{
    void LogInformation(String message, Object... args );
    void LogWarning(String message,  Object... args);
    void LogError(String message,  Object... args);
}
