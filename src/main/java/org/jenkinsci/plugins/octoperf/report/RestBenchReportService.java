package org.jenkinsci.plugins.octoperf.report;

final class RestBenchReportService implements BenchReportService {

  private static final String REPORT_URL = "https://app.octoperf.com/#/app/workspace/%s/project/%s/analysis/%s/%s";

  @Override
  public String getReportUrl(final String workspaceId, final BenchReport report) {
    return String.format(
      REPORT_URL,
      workspaceId,
      report.getProjectId(),
      report.getBenchResultId(),
      report.getId());
  }
}
